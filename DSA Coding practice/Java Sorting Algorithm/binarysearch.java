// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class binearysearch{
   
   
    public static void main(String[] args) {
        int nums[] = {5,7,8,11,13};
        int target = 59;
        int result = binearysearch(nums , target);
        
        if (result != -1)
        System.out.println("Element found at index :" + result);
        else
        System.out.println("Element ont found");
        
    }
    
    public static int binearysearch(int[] nums , int target){
      int l = 0 ;
      int r = nums.length -1;
      while(l <=r ){
        int mid = (l + r)/2;
        
        if(nums[mid] == target ){
            return mid;
        }
        else if(nums[mid] <target){
            l = mid+1;
        }
        else{
            r = mid -1;
        }
      }
      return -1;
    }
}