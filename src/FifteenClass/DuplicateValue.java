package FifteenClass;

import java.util.Arrays;

public class DuplicateValue {
    public static void main(String[] args) {

        int [] originalArray = {3,4,5,6,7,8};


            int[] duplicatedArray = new int[originalArray.length * 2];


            for (int i = 0; i < originalArray.length; i++) {
                duplicatedArray[i] = originalArray[i];
                duplicatedArray[i + originalArray.length] = originalArray[i];
            }


            System.out.println("Original Array: " + Arrays.toString(originalArray));
            System.out.println("Duplicated Array: " + Arrays.toString(duplicatedArray));
}
}


