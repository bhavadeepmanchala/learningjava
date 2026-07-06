package binarysearching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,3,7,56,78,79,89};
        int target = 7;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int middle = start + (end - start) / 2;
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }

        }
        return -1;
    }


}
