package binarysearching;

public class OrderAgnostic {
    public static void main(String[] args) {
   // int [] arr = {89,72,65,34,23,12,4,2};
      int [] arr = {1,23,34,56,67,78,89};
    int target = 67;
    int ans = binarySearch(arr,target);
    System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target > arr[middle]) {
                    start = middle + 1;
                } else  {
                    end = middle - 1;
                }
            }

            else {
                if (target < arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
            return -1;


    }
}
