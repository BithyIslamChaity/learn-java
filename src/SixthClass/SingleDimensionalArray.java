package SixthClass;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main (String[] args){
        int[] marks = new int[14];
        marks[0] = 5;
        marks[2] = 0;
        marks[13] = 23;

        System.out.println(marks[13]);
        System.out.println("Common for loop");
        for (int i= 0; i <marks.length; i++) {
            System.out.print(marks[i] +",");
        }
System.out.println();
        System.out.println("For each");
        System.out.print("[");
        String st="";
        for(int m : marks){
           // System.out.print(m + ",");
            st = st + m + ",";
        }
        st = st.substring(0, st.length() - 2);
        System.out.print(st);
        System.out.print("]");
        System.out.println();
        System.out.println("Print with Arrays class");

        String ft = (Arrays.toString(marks));
        ft = ft.substring(1, ft.length() - 1);
        System.out.println(ft.toString());


    }
}
