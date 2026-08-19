package oops.oops_3;
// --- 1. COMPILE-TIME POLYMORPHISM (Method Overloading) ---
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
// Same method name, different number of parameters
// or
// Same method name, different data types