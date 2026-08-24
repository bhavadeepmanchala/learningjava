package oops.oops_5;

public class InterfaceMain implements Interface01,Interface02 {

    @Override
    public void method01() {
        System.out.println("Method one");
    }

    @Override
    public void method02() {
        System.out.println("Method Second");
    }

    @Override
    public void method03() {
        System.out.println("method three");
    }

    public void method04() {
        System.out.println("Method four");

    }

    public static void main(String[] args) {
        Interface01 obj = new InterfaceMain();
        obj.method01();
        Interface02 obj2 = new InterfaceMain();
        obj2.method03();
    }
}
