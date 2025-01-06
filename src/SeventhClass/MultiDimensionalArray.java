package SeventhClass;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int[] primeNumber = {2,3,5,7,11,13,17,19,23,27,29,31,37,41,43,47,67,
                71,73,79,83,89,97};
       // System.out.println(Arrays.toString(primeNumber));
        Arrays.sort(primeNumber);
        int[] copyOfPrimenumber=Arrays.copyOf(primeNumber,primeNumber.length);
        Integer [] test = new Integer[primeNumber.length];
        for (int i = 0; i < primeNumber.length; i++){
            test[i] = primeNumber[i];
        }
       // Arrays.sort(test, Collection.reverseOrder);
        System.out.println(Arrays.toString(primeNumber));



        int[][] axis = new int [3][2];
        axis [0][0] =1;
        axis [0][1] =2;

        axis [1][0] =17;
        axis [1][1] =12;

        axis [2][0] =33;
        axis [2][1] =22;

        //axis [3][0] =2354;

int [][] matrix = {
        {1234, 13456,2467,27},
        {2345,455434,334,0,4465},
        {76344,48655,34,34,43,23},
};
        System.out.println(Arrays.deepToString(matrix));
    }
}
