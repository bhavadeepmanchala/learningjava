package sortings;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int arr [] = {1,4,3,77,2,6,-1};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Sorting(int [] arr){
        boolean swapped;
        for (int i = 0; i < arr.length ; i++) {
          swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]  < arr[j-1]) {
                    int temp = arr[j - 1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

        if(!swapped ) { /*if given array is already sorted or gets sorted in less than arr.length loops
                            it doesn't undergo swap so the false will not update to break the loop to avoid unnecessary
                             loops*/
            break;
        }

        }
    }
}
