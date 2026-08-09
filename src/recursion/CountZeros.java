package recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(0));
    }
    static int count(int n){
        if(n == 0) return 1; // At start if only(n=0 as the input) handle 0 as special input ,because it is counted as "1" at
       return helper(n,0);//this return is never executed if n = 0 ;
    }

    static int helper(int n , int c){
        if(n == 0) { // here it is for iterated value of n
            return c;
        }else {
            if(n % 10 == 0){
                return helper( n/10 , c+1);
            }else{
                return helper(n/10 , c);
            }
        }
    }
}
