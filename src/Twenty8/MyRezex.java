package Twenty8;

import java.util.Scanner;

public class MyRezex {
        public static String pattern =
                "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
                        "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an IP address: ");
            String ipAddress = scanner.nextLine();

            if (ipAddress.matches(
                    pattern)) {
                System.out.println(ipAddress + " is a valid IP address.");
            } else {
                System.out.println(ipAddress + " is not a valid IP address.");
            }

            scanner.close();
        }
    }

