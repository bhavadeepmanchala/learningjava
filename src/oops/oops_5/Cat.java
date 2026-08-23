package oops.oops_5;

class Cat extends AbstractDemo {
    Cat(String name) {
        super(name);
    }
    @Override
    void message(){
        System.out.println("A Cat " + name);
    }
}