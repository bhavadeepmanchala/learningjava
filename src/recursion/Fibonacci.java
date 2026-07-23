package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int num = fibo(7);
        System.out.println(num);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
