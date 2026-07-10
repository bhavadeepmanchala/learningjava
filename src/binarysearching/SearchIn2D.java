package binarysearching;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {12,13,23,24},
                {30,45,56,67},
                {33,55,60,66}
        };
        int target = 66;
        int []ans = searching(arr,target);
        System.out.println(Arrays.toString(ans));

    }
     static int [] searching(int [][] arr, int target) {
         int row = 0;
         int col = arr.length - 1;
         while (row < arr.length && col >= 0) {
             if (arr[row][col] == target) {
                 return new int[]{row, col};
             } else if (arr[row][col] < target) {
                 row++;
             } else {
                 col--;
             }

         }
         return new int[]{-1, -1};
     }
}
