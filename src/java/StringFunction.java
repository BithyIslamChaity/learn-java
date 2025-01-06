package java;

public class StringFunction {
    public static void main(String[] args) {
        String name = "Amra Bangladesh er bashinda";
        String anotherName = "";
        String nameTwo ="\t\t\t\t\nwho are you \n\t";
        String nameThree ="\t\t\t\t\nwho are you \n\n\n\t";

        String num = "189234";
        int numInt = Integer.parseInt(num);
        String num2 = "189234.98234";
        double doubleValue = Double.parseDouble(num2);
        System.out.println(doubleValue);

        int a = 123;
        //String stringValue = String.copyValueOf(a);
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.contains("s"));
System.out.println(name.charAt(2));
System.out.println(name.concat("jog kprlam"));
System.out.println(name.isEmpty());
System.out.println(anotherName.isEmpty());
System.out.println(name.endsWith("da"));
System.out.println(name.indexOf("A"));



String nahid = "human";
String hemel = "human";

System.out.println(nahid.equals(hemel));
System.out.println(nahid.equalsIgnoreCase(hemel));

String numString = "22";
int convertedFromString = Integer.parseInt(numString);

System.out.println(convertedFromString);
System.out.println(convertedFromString);
System.out.println(((Object)convertedFromString).getClass().getSimpleName());
System.out.print("This value is of integer");

System.out.println();


    }
}
