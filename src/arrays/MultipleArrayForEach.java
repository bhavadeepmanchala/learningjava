package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleArrayForEach {
    public static void main(String[] args) {
        int [][] arr = new int [3][3];
        Scanner input = new Scanner(System.in);
        for (int rows = 0; rows < arr.length ; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = input.nextInt();
            }
        }
         for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));

        }// or use
        /*for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
        }*/ // or use
         /* for (int[] ints : arr) {
            for(int value : ints) {
                System.out.print(value + " ");
            }
            System.out.println();
        }*/
    }
}
