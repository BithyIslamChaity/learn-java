package java;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void nain(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius *1.8)+32;
        System.out.println("celsius " + celsius + " is " +
                fahrenheit + " in fahrenheit");
    }
}
