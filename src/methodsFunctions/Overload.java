package methodsFunctions;

public class Overload {
    public static void main(String[] args) {
        function(9,7);
        function(34,56,43);
        function("bhavadeep");
    }
    static void function(int a , int b) {
        System.out.println(a + " " + b);
    }
        static void function(int c, int d ,int e){
            System.out.println(c + " " + d + " " +e);
        }
        static void function (String name){
            System.out.println(name);
        }

}
