package oops.oops_1;
import java.util.*;
public class WrapperClass {
    String name;
    int rollno;

  /*  @Override
    protected void finalize () throws Throwable {
        System.out.println("Object is destroyed");
    }
*/
    public static void main(String[] args) {
        // WRAPPER CLASS (Integer , Double , Boolean ....)
        Integer num = 45;
        num.byteValue();
        System.out.println(num);
        // final (Key Word)
        // -- final variable ---
        final int x = 53;
        // x =90; gives error as x is a final variable (cannot reassign)
        final List<String> list = new ArrayList<>();
        list.add("JAVA"); // here we can modify arraylist but cannot reassign
        //list = new ArrayList(); error
        // --- final objects ---
        final WrapperClass Student = new WrapperClass();
        Student.name = "Bhavadeep";
        System.out.println(Student.name);
        // Student = new WrapperClass(); // error //
    }

}