package Twenty3Class;
import java.util.Scanner;
public class ReturnSumOfTrueFalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;

        boolean isLessThan100 = (sum < 100);

        if (isLessThan100) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
            }




