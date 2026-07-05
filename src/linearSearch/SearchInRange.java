package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {23,56,75,5,4,1};
        int target = 23;
        System.out.println(searchInRange(arr , target ,2,5));
    }
    static int searchInRange(int [] nums , int key , int start, int end){
        if(nums.length == 0){
            return -1;
        }
        for (int i = start; i <end ; i++) {
            if(nums[i] == key){
                return i;
            }

        }
        return -1;
    }
}
