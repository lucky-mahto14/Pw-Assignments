public class MonotonicArray{
 public static boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                inc=false;
                break;
            }
            
        }
        for(int j=0;j<nums.length-1;j++){
             if(nums[j+1]>nums[j]){
                dec=false;
                break;
            }
        }
        
        if(inc || dec){
            return true;
        }
        else{
            return false;
        }
    }
public static void main(String args[]){
    int nums[]={1,2,2,4};
    System.out.println(isMonotonic (nums));
  }
}
