public class MoveZeros{
    public void moveZeroes(int[] nums) {
        int i;
        int position=0;
        for( i=0;i<nums.length;i++){
            
            if(nums[i]!=0){
                nums[position]=nums[i];
                position++;
            }
        }
        // int j=nums.length-1;
        while(position<nums.length){
            nums[position]=0;
            position++;
        }
    }
    public static void main(String[] args){
        int[] nums={0,1,0,3,1,2};
        moveZeroes(nums);
    }
}