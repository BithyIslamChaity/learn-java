package Homework;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("enter number of disks: ");
                int n = input.nextInt();
                System.out.println("The moves are:");
                moveDisks(n, 'A', 'B', '(');
            }

            public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
                if (n == 1)
                    System.out.println("Move disk " + n + "from" +
                            fromTower + " to " + toTower);
                else {
                    moveDisks(n - 1, auxTower, toTower, fromTower);
 }
}
 }
