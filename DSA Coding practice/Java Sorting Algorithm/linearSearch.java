public class linearSearch {
    public static void main(String[] args) {
        int nums[] = {5,7,8,11,13};
        int target = 59;
        int result = linearSearch(nums , target);
        
        if (result != -1)
        System.out.println("Element found at index :" + result);
        else
        System.out.println("Element ont found");
        
    }
    
    public static int linearSearch(int[] nums , int target){
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target)
            return i;
        }
        return -1;
    }
}
