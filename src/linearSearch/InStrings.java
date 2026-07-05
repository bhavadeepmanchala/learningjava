package linearSearch;

public class InStrings {
    public static void main(String[] args) {
        String name = "Bhavadeep";
        char target = 'b';
        System.out.println( LinearSearch(name , target));
    }
    static boolean LinearSearch(String name , char target ){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {
            if(target == name.charAt(i)){
                return true;
            }

        }
        return false;
    }

}
