package basics;

import java.util.Scanner;

public class convcastpromo {
    public static void main(String[] args) {
        //type conversion (smaller to larger (automatically))
        Scanner input = new Scanner(System.in);
        float conversion= input.nextFloat();
        System.out.println(conversion);
        System.out.println();
        /*here,when you enter an integer value instead of float value
        where code is written for a float value the integer will automatically
        convert into float
         */
        //now,type casting(larger to smaller(explicit/narrowing))
        int a = (int)(45.6);
        System.out.println(a);
        byte b = (byte)(257);//here do modulo the given number with 256
        System.out.println(b);
        // now,automatic type conversion(automatically)
        byte c = 23;
        byte d = 45;
        int result = c*d;
        System.out.println(result);
        /*here, the result will automatically convert into higher value
       (integer) to avoid the overflow
         */

    }
}
