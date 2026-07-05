package linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int target = 4;
        System.out.println(LinearSearch02(nums , target));
        System.out.println(LinearSearch01(nums , target));
    }

     static int LinearSearch01(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
         for (int index = 0; index < nums.length ; index++) {
             if (nums[index] == target ){
                 return index;
             }
             
         }
         return -1;
    }
    static int LinearSearch02(int [] nums , int target){
        for (int ints : nums){ //using for each loop here as we have no use or no need return index
            if(ints == target){
                return ints;
            }
        }
        return Integer.MAX_VALUE;//here we cannot return "-1" as it could be an element in array so we use a constant value
    }
}
