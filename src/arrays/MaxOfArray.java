package arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int [] arr = {1,23,4,90,78,48};
        max(arr);
        System.out.println("maximum value of array" + " "+ max(arr));
    }
    static int max(int [] array){
        int maxValue = array[0];
        for (int i = 1 ; i < array.length ; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
