public class MaxProductOfThreeNUmber{
  public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
  public static void main(String args[]){
    int nums[]={1,2,3,4};
    System.out.println(maximumProduct(nums));
  }
}
