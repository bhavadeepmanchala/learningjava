package methodsFunctions;

public class Armstrong {
    public static void main(String[] args){
        for (int i =100;i <1000;i++){
        if(isArmstrong(i)){
            System.out.print(i+" a");
        }
        }
    }
    static boolean isArmstrong(int n){
        int oringinal = n;
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem ;
            n /= 10;
        }
       return oringinal == sum;
    }
}
