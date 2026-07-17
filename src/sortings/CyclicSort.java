package sortings;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] array = {2,4,1,5,3};
        Sorting(array);
        System.out.println(Arrays.toString(array));
    }
    static void Sorting(int [] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr , i ,correct);
            }else{
                i++;
            }

        }
    }
    static void swap(int [] arr,int x ,int y){
       int temp = arr[x];
       arr[x] = arr[y];
       arr[y] = temp;
    }
}
