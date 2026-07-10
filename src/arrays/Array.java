package arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] arr = new int [5];
        System.out.println("enter you array elements");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
      /*  for (int j : arr) { //enhanced for loop also known as (for each)
            System.out.print(j + " ");
        } */
    }
}
