package oops.oops_5Second;

public class ExtendedMain implements ExtendA{
    @Override
    public void hello() {
        System.out.println("HELLO");
    }

    @Override
    public void hi() {
        System.out.println("HI");
    }

    @Override
    public void afternoon() {
        System.out.println("AFTERNOON");
    }

    public static void main(String[] args) {
        ExtendedMain obj = new ExtendedMain();
        obj.hello();
    }
}
