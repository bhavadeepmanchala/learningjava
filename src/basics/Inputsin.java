package basics;
//this import line will automatically generate once you enter Scanner(in intellij)#shortcut
import java.util.Scanner;

public class Inputsin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number:");
        int rollno = input.nextInt();
        System.out.println("Your roll number is:"+rollno);
        float decimal = input.nextFloat();
        System.out.println(decimal);

    }
}
