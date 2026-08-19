package oops.oops_3;
// main class for (Calculator class and Animal)
public class PolymorphismDemo {
    public static void main(String[] args) {

        // Testing Compile-Time Polymorphism
        System.out.println("--- Compile-Time Polymorphism ---");
        Calculator calc = new Calculator();

        // Compiler resolves which method to call based on argument types
        System.out.println("Sum of integers: " + calc.add(5, 10));
        System.out.println("Sum of doubles: " + calc.add(5.5, 10.5));

        // Testing Runtime Polymorphism
        System.out.println("\n--- Runtime Polymorphism ---");

        // Parent class references pointing to Child class objects
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Java Virtual Machine (JVM) determines the method to run at runtime
        myDog.makeSound();
        myCat.makeSound();
    }
}