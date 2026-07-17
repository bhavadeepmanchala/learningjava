package patterns;

public class Pattern {
    public static void main(String[] args) {
       pattern05(5);
    }
    //i stands for rows and j for columns
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern01(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern02(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //while printing integer patterns check to start the index from 0 but in star patterns it maybe either 0 or 1
    static void pattern03(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern04(int n){
        for (int i = 0; i < 2*n ; i++) {
            int totalColumns = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalColumns ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern05(int n){
        for (int i = 0; i < 2*n ; i++) {
            int columns = i > n ? 2 * n - i : i;
            int spaces = n - columns;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < columns ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern06(int n){

    }
}