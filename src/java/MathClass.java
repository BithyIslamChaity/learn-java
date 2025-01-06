package java;

public class MathClass {
    public static void main(String[] args) {
        int abs = Math.abs(-98);
        System.out.println(abs);
        double pow = Math.pow(2.2, 3);
       System.out.println(pow);

        double ceil = Math.ceil(2342.23);
        System.out.println(ceil);

        double floor = Math.floor(12342.23);
        System.out.println(floor);

        long round = Math.round(2342.23);
        System.out.println(round);

        double random = Math.random();
        System.out.println(random);

        int castedInd = (int) (random*100.0);
        System.out.println(castedInd);

    }
}
