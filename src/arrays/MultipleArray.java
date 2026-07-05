package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = in.nextInt();
            }
        }
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                System.out.print(arr[rows][col] + " ");
            }
        }
    }
}
// or try this way to print the output(best way)
// for(int rows = 0 ; rows <= arr.length; rows++){
//System.out.print(Arrays.toString(arr[rows]));