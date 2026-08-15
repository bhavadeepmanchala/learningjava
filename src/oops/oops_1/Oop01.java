package oops.oops_1;

public class Oop01 {
    public static void main(String[] args) {

        // ---------- 1. Creating objects using the parameterized constructor ----------
        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        rahul.greeting();          // uses 'this' inside the method
        kunal.changeName("Shoe lover");
        kunal.greeting();

        System.out.println("-----");

        // ---------- 2. Copy constructor: new object, same data ----------
        Student copyOfKunal = new Student(kunal);
        System.out.println(copyOfKunal.name); // "Shoe lover" (copied value)

        // ---------- 3. Default constructor (chains to parameterized one via this()) ----------
        Student random = new Student();
        System.out.println(random.name);      // "default person"
        System.out.println(random.rno);       // 13
        System.out.println(random.marks);     // 100.0

        System.out.println("-----");

        // ---------- 4. Reference vs copy: two variables pointing to ONE object ----------
        Student one = new Student();
        Student two = one;          // 'two' is NOT a new object, just another name for 'one'
        one.name = "Something something";
        System.out.println(two.name); // prints "Something something" too, since one == two
    }
}

// A "blueprint" for every student object we create.
class Student {

    // ---------- Properties (instance variables / fields) ----------
    int rno;
    String name;
    float marks;

    // ---------- Constructors ----------

    // Parameterized constructor: runs when we do `new Student(rno, name, marks)`
    Student(int rno, String name, float marks) {
        // 'this.rno' = the field belonging to THIS object
        // 'rno'      = the parameter passed in
        // without 'this', Java wouldn't know which one you mean
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Copy constructor: builds a new object using another object's values
    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Default (no-argument) constructor
    Student() {
        // constructor chaining: calling another constructor of the SAME class
        // using this(...) — must be the first line of the constructor
        this(13, "default person", 100.0f);
    }

    // ---------- Methods ----------

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        // parameter 'name' shadows the field 'name', so we need 'this.name'
        // to refer to the object's own field
        this.name = name;
    }
}
