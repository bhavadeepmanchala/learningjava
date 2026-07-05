package methodsFunctions;

import java.util.Arrays;

public class VariableParaMulti {
    public static void main(String[] args) {
        multiple(5,6,"bhavdeep","deep","in","ocean");

    }
    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }
}
