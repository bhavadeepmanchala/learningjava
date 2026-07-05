package methodsFunctions;
import java.util.Arrays;
public class VariableArguments {
    public static void main(String[] args) {

        function(2,34,5,6,7,8,9,74,3,22);
    }
       static void function(int...v){
        System.out.println(Arrays.toString(v));
    }
}
// for string
//function("bahva","deep","human","titan");
  //  }
//static void function(String...v){
//    System.out.println(Arrays.toString(v));