package NineteenthClass;

public class RecursionExample {
    public static void main(String[] args) {
        int sum = sum(4);
        // System.out.println(x);
        System.out.println(sum);
    }




    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;

//        public static int sumTwo(int n) {
//            int result = 0;
//            for (int i = 0; i <= n; i++) {
//                result += i;
//            }
//            return result;

}
}
