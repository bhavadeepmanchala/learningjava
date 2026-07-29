package bitwise;

public class Unique {
    public static void main(String[] args) {
        int [] arr ={1,2,3,2,4,3,1};
        System.out.println(answer(arr));
    }
    static int answer(int [] arr){
        int unique = 0;

        for(int n : arr) {
            unique ^= n;
        }
        return unique;
    }

}
