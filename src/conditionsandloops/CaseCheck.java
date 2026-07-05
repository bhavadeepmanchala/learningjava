package conditionsandloops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter your character");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch>='a'&& ch<='b'){
            System.out.println("Lower Case");
            }
        else{
            System.out.println("Upper Case");
        }
    }
}
