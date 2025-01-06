package Twenty2ClassTest;
import java.time.LocalDate;
public class LastDate {


        public static void main(String[] args) {

            LocalDate currentDate = LocalDate.now();


            int lastDay = currentDate.lengthOfMonth();

            System.out.println("Last day of the current month: " + lastDay);
        }
    }

