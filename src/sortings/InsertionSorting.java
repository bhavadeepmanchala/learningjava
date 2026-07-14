package sortings;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int [] arr = {15,-3,1,56,12,8,14};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr, int x, int y  ){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }
    static void Sorting(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr ,j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

}
