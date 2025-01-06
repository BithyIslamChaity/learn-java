package Twenty2ClassTest;
import java.util.Stack;
public class LinkedList {

        Node head;  // head of list


        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void append(int newData) {
            Node newNode = new Node(newData);


            if (head == null) {
                head = newNode;
                return;
            }

            //
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        public void printReverse() {

            Stack<Node> stack = new Stack<>();

            Node current = head;
            while (current != null) {
                stack.push(current);
                current = current.next;
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop().data + " ");
            }
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            // Create a linked list 1->2->3->4->5
            list.append(1);
            list.append(2);
            list.append(3);
            list.append(4);
            list.append(5);
            System.out.println("Linked list in reverse order:");
            list.printReverse();
        }
    }


