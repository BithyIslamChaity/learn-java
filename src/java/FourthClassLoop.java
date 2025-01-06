package java;

public class FourthClassLoop {
    public static void main(String[] args) {
        //For Loop
        for(int i= 1; i > 0; i++){
            if(i == 5) {
                continue;
            }
            System.out.println("Bithy" + i);
            //System.out.println(i);
            if(i==3){
                break;
            }
        }
       // sum od one to ten
            int result = 0;
            for (int i = 1; i<=10; i++) {
                result = result + i;
            }
            System.out.println("Sum of one to ten is " + result);
//sum of 1 to 1000(oddnumber)
            int x = 0;
        for (int i = 2; i <= 1000; i=i+2) {
            x += i;
        }
        System.out.println("Sum of one to one hundred is " + x);

      //



     }
        }




