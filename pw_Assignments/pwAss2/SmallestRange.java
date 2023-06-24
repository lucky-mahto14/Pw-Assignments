public class SmallestRange{
   public int smallestRangeI(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int ans=(max-k)-(min+k);
        return Math.max(0,ans);
    }
  public static void main(String[] args){
    int[] nums={1,3,6};int k=3;
    System.out.println(smallestRangeI(nums,k));
}
