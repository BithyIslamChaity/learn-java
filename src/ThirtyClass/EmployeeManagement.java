package ThirtyClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("C:\\Users\\Java Student PC-3\\Desktop\\1285554\\Book1.csv"))) {
            while (scanner.hasNextLine()) {
                String[] a = scanner.nextLine().split(",");
                String name = a[1].trim();
                int id = Integer.parseInt(a[0].trim());
                int salary = Integer.parseInt(a[2].trim());
                String type = a[3].trim();

                if (type.equalsIgnoreCase("FullTime")) {
                    employee.add(new FullTimeEmployee(name, id, salary));
                } else if (type.equalsIgnoreCase("PartTime")) {
                    employee.add(new PartTimeEmployee(name, id, salary));
                } else if (type.equalsIgnoreCase("Contract")) {
                    employee.add(new ContractEmployee(name, id, salary));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
        try {
            PrintWriter a2 = new PrintWriter("C:\\Users\\Java Student PC-3\\learn-java\\src\\ThirtyClass\\Thirty1.csv");
            for(Employee a3:employee ) {
                a3.setSalary(12000);
                a2.println(a3);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
