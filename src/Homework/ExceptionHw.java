package Homework;
import java.util.Scanner;
public class ExceptionHw {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();

            try {
                if (!username.equals("Bithy")) throw new CustomException("Incorrect username!");
                if (!password.equals("me")) throw new CustomException("Incorrect password!");
                System.out.println("|>>   Welcome, " + username + "   |");
            } catch (CustomException e) {
                System.out.println("ERROR: " + e.getMessage());
            } finally {
                input.close();
            }
        }

        public static class CustomException extends RuntimeException {
            public CustomException(String message) { super(message); }
        }
    }


