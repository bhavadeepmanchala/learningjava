package conditionsandloops;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);

        //or use
     //   int max =Math.max(c,Math.max(a,b));
       // System.out.println(max);
    }
}
//or use
//int max =Math.max(c,Math.max(a,b));
