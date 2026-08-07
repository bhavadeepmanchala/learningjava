package math;

import java.util.Scanner;

public class LCM_GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.println(Gcd(n,p));
        System.out.println(Lcm(n,p));
    }
    static int Gcd(int n, int p){
        if (n == 0){
            return p;
        }else{
            return Gcd(p%n,n);
        }
    }
    static int Lcm(int n , int p){
        return n * p / Gcd(n,p);
    }


}
