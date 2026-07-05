package linearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,45,},
                {34,43,6,7},
                {23,65,72}
        };
        int target = 65;
        int [] ans = search( arr,target );
        System.out.println(Arrays.toString(ans));
    }
    static int [] search(int [][] arr , int target){
        if(arr.length == 0){
            return new int [] {-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==target){
                    return  new int [] {i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }
}
