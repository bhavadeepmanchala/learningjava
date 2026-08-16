package oops.oops_2;

class Singleton {
    // private constructor prevents anyone outside from creating objects directly
    private Singleton() {
    }

    // the single instance, shared by everyone
    private static Singleton instance;

    // public method to get access to that one instance
    public static Singleton getInstance() {
        // check whether the object is already created or not
        if (instance == null) {
            instance = new Singleton(); // created only the FIRST time
        }
        return instance; // same object returned every other time
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        // all 3 ref variables are pointing to just ONE object

        System.out.println(obj1 == obj2); // true
        System.out.println(obj2 == obj3); // true

    }
}