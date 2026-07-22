package strings;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        System.out.println("kunal" + new ArrayList<>());
        System.out.println("hahahdeep" + new Integer(56));
    }
}
