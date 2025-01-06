package TwelvethClass;

public class StringClass {
    public static void main(String[] args) {
        String s = new String("This is s string");
        String s1 =("This is also a string");

        String s2 = "Welcome to Java";
        String s3 = new String("Welcome ti Java");
        String s4 = "Welcome to Java";

        s2 = "Changed test";

        System.out.println("s2 == s3 is " + (s2.equals(s3)));
        System.out.println("s2 == s4 is " + (s2.equals(s4)));

        int a = 1;
        int b = 2;
        System.out.println(a == b);

        try{String s5 = String.format("%7.2f%6d-4s", 45.556, 14);
        System.out.println(s5);
        s5 = String.format("%7.2f%6d%4s", 45.556, 14, "AB");
        System.out.println(s5);
        }catch(Exception e){
            System.out.println("what is this error 🤷‍♀️" + e);
        }
    }
}
