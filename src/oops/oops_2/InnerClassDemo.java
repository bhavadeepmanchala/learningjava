package oops.oops_2;

public class InnerClassDemo {

    // ================================
    // 1) STATIC NESTED CLASS
    // - No outer instance needed to create it
    // - Field `name` is a plain INSTANCE variable -> each object gets its own copy
    // ================================
    static class TestInstance {
        String name;  // instance variable (NOT static)

        public TestInstance(String name) {
            this.name = name;  // 'this' refers to the CURRENT object being built
        }
    }

    // ================================
    // 2) SAME static nested class structure,
    // but `name` is now STATIC -> shared by ALL objects
    // ================================
    static class TestStatic {
        static String name;  // static variable -> only ONE copy exists

        public TestStatic(String name) {
            TestStatic.name = name;  // writes to the single shared copy
            // Note: 'this.name' would NOT work here for a static field
            // (Java allows it, but it's misleading — always use ClassName.field for statics)
        }
    }

    // ================================
    // 3) NON-STATIC (regular) inner class
    // - Needs an outer class OBJECT to be created
    // - Can access outer class's instance members directly
    // ================================
    class InnerNonStatic {
        void greet() {
            // can access outer class instance field directly, no qualifier needed
            System.out.println("Hello from inner class, outerField = " + outerField);
        }
    }

    int outerField = 42; // instance field of the outer class

    public static void main(String[] args) {

        System.out.println("--- Instance field demo ---");
        TestInstance a = new TestInstance("Bhavadeep");
        TestInstance b = new TestInstance("Manchala");
        System.out.println(a.name); // Kunal — separate copy
        System.out.println(b.name); // Rahul — separate copy

        System.out.println("\n--- Static field demo ---");
        TestStatic x = new TestStatic("Bhavadeep");
        TestStatic y = new TestStatic("Manchala");
        System.out.println(x.name); // Rahul — shared copy, overwritten
        System.out.println(y.name); // Rahul — same shared copy

        System.out.println("\n--- Non-static inner class demo ---");
        // Needs an outer class instance first:
        InnerClassDemo outer = new InnerClassDemo();
        InnerClassDemo.InnerNonStatic inner = outer.new InnerNonStatic();
        inner.greet(); // Hello from inner class, outerField = 42
    }
}
