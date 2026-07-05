package methodsFunctions;

public class StringWithReturn {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String wishes = "how are you?";
        return wishes;
    }
}
