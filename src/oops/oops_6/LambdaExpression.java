package oops.oops_6;

import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<5; i++ ){
            arr.add(i+1);
        }
       // arr.forEach(item) -> System.out.println(item*2));
        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;

        LambdaExpression calci = new LambdaExpression();
        System.out.println(calci.operate(5, 3, sum));
        System.out.println(calci.operate(6, 7, prod));
        System.out.println(calci.operate(9, 8, sub));
    }
    private int operate (int a, int b, Operation op){
        return op.operation(a,b);
    }
}
interface Operation {
    int operation(int a, int b);
}