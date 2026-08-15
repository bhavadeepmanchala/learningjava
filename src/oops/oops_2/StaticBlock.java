package oops.oops_2;

public class StaticBlock {
    static int a = 43;
    static int b ;
    static{//runs first when a class is loaded but only once (when first obj is created)
        System.out.println("I am in static block");
        b = a * 5 ;
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        // creating objects to check the execution of StaticBlock
        StaticBlock obj1 = new StaticBlock();
        System.out.println(obj1.a + " " + obj1.b);
        // second object
        StaticBlock obj2 = new StaticBlock();
        b += 23;
        System.out.println(obj2.a + " " + obj2.b);
        // static block will be executed only once
    }
}
