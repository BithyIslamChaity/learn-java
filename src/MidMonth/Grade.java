package MidMonth;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your marks: ");
                int marks = scanner.nextInt();


                if (marks<0 || marks>100) {
                    System.out.println("Invalid input. Marks must be between 0 to 100.");
                }
                else if (marks >= 90 && marks <=100) {
                    System.out.println("You got Grade: A+");
                } else if (marks >= 70 && marks<90) {
                    System.out.println("You got Grade: A");
                } else if (marks >= 60 && marks<70) {
                    System.out.println("You got Grade: B");
                } else if(marks>=0 ) {
                    System.out.println("Your are Failed.");
                }

                // Close the scanner
                scanner.close();
}
        }