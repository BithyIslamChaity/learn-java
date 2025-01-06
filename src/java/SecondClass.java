package java;

import java.util.Scanner;

public class SecondClass{
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter your name");
     String inputString = sc.nextLine();
     System.out.print("Enter your age: ");
     int nextInt = sc.nextInt();
     System.out.println("Enter your school ");
     String school = sc.next();

     System.out.println("Hi " + inputString +"! you are " + nextInt + "years young");

String name = "Bithy";
System.out.println(name);
System.out.println(SecondClass.printHi(inputString, nextInt,school));






     System.out.println("Sum  of two fixed variable is" + SecondClass.sum());

     System.out.println("Hi " + inputString + "!");


 }
 public static int sum() {
     int a = 2;
     int b =4;
     return a + b;
 }
 public static int sum (int a,int b) {
      return a + b;
 }
     public static String printHi(String inputString,int nextInt,String school){
          return "Hi " + inputString + " you are " +
                  nextInt + " years old and your school name is " + school;
     }
}
