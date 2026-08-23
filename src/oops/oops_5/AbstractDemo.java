package oops.oops_5;

public abstract class AbstractDemo {
    String name;

    AbstractDemo(String name){
        this.name = name;
    }
    // Abstract method - no body ,subclasses must implement them
    abstract void message();

    // Concrete(Regular) method - has a body , shared by all subclasses
    //static method also can be used as it is not abstract
    void sleep (){
        System.out.println("message from:" + name);
    }
}
class Hero extends AbstractDemo {
    Hero(String name){
        super(name);
    }
    @Override
    void message() {
        System.out.println("Hero message: " + name);
    }

}
 class Villain extends AbstractDemo{

    Villain(String name){
        super(name);
    }

    void message(){
        System.out.println("Villain message: " + name);
    }

}
