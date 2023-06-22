
import java.util.*;
public class SumOfTwo {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int dif=target-nums[i];
            if(map.containsKey(dif)){
                return new int[]{map.get(dif),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};int target = 9;
        int[] ans=twoSum(nums,target);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
