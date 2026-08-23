package oops.oops_5;

public class Main {
    public static void main(String[] args) {
        Hero hero01 = new Hero("Superman");
            hero01.message();

        Villain villain01 = new Villain("Joker");
        villain01.message();
        villain01.sleep();

         Cat jerry = new Cat("Jerry");
         jerry.message();

//   AbstractDemo instance = new AbstractDemo(); // error because of reference of super class
    }
}
