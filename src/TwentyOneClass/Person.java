package TwentyOneClass;

public class Person {

        private Address address;

        public Person(String city, String state) {
            address = new Address(city, state);
        }

        public void printAddress() {
            System.out.println("Person's Address:");
            address.displayAddress();
        }
    }
    class Main {
        public static void main(String[] args) {
            Person person = new Person("New York", "New York");

            person.printAddress();
}
    }
