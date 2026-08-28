package oops.oops_5Second;
class Nested02 implements Nested.NestedInterface{
   @Override
    public boolean isOdd(int num){
       return (num & 1) == 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Nested02 obj = new Nested02();
        System.out.println(obj.isOdd(9));
    }
}