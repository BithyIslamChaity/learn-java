package TwentyOneClass;

public class Address {
        private String city;
        private String state;


        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }


        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }


        public void displayAddress() {
            System.out.println("City: " + city);
            System.out.println("State: " + state);
}

    }

