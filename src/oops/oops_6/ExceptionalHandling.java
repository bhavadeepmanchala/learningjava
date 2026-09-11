package oops.oops_6;

import java.util.Scanner;

public class ExceptionalHandling {
//    keywords -- try,catch,finally
    public static void main(String[] args) {
        int a , b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        try{
            int c = a/b;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will be always executed");
        }
    }

//    keywords - throw and throws
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("please do not divide with 0");
        }
        return a / b;
    }
}
