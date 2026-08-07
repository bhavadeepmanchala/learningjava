package math;
import java.util.Scanner;

public class LcmGcd02 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt(); // number of elements
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int resultGcd = arr[0];
            int resultLcm = arr[0];
            for (int i = 1; i < n; i++) {
                resultGcd = Gcd(resultGcd, arr[i]);
                resultLcm = Lcm(resultLcm, arr[i]);
            }

            System.out.println(resultGcd);
            System.out.println(resultLcm);
        }

        static int Gcd(int n, int p) {// using long to avoid overflow in lcm
            if (n == 0) {
                return p;
            } else {
                return Gcd(p % n, n);
            }
        }

    static int Lcm(int n, int p) {// use long
        return n / Gcd(n, p) * p; // divide first to reduce overflow risk
    }
    }

