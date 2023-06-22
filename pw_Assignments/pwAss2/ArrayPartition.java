import java.util.Arrays;
public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        int max=0;
Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            max=max+Math.min(nums[i],nums[i+1]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }
}