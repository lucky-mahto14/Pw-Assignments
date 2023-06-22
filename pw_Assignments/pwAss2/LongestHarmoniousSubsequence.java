import java.util.HashMap;
public class LongestHarmoniousSubsequence{
    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:map.keySet()){
            if(map.containsKey(i+1)){
                max=Math.max(max,map.get(i)+map.get(i+1));
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}