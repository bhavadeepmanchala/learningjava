package bitwise;

public class Digits {
    public static void main(String[] args) {
        int n = 5;//gives no of digits in binary form for a given number in decimal form
        int b = 2;
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
