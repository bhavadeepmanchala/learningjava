package recursion;
public class Reverse{
     static int rev = 0 ;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        reverse(n/10);
    }
     static int reverse02(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n , digits);
    }
    static int helper (int n , int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10 ;
        return rem * (int)(Math.pow(10 , digits - 1)) + helper(n/10,digits -1);
    }
    public static void main(String[] args) {
        int n = 987;
        reverse(n);
        System.out.println(reverse02(n));
    }
}

