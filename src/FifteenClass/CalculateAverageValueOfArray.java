package FifteenClass;

public class CalculateAverageValueOfArray {
    public static void main(String[] args) {


                int[] numbers = {15, 20, 33, 9, 50};

                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }

                double average = (double) sum / numbers.length;

                // Display the average
                System.out.println("The average value of the array elements is: " + average);
            }
        }
