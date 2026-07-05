package methodsFunctions;

import java.util.Scanner;

public class SumWithReturn {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    }
