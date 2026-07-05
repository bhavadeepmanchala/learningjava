package methodsFunctions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){//if we return any value use the returning datatype instead of void
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println(sum);// instead printing return the value to main function
    }
}
//next program is the same example