package Twenty2ClassTest;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class LastDateOfMonth {
    public static void main(String[] args) {

                LocalDate currentDate = LocalDate.now();

                LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());

                System.out.println("Last day of the month: " + lastDayOfMonth);
            }
        }
