package oops.oops_5Second;

public class Nested {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}
class Nested02 implements Nested.NestedInterface{
   @Override
    public boolean isOdd(int num){
       return (num & 1) == 1;
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}