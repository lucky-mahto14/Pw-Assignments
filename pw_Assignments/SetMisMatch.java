

public class SetMisMatch {
    public static int[] findMissing(int[] arr){
        //First set the elements in it's correct position
        int i=0;
        int n=arr.length;
        while(i<n){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        //find missing and duplicate number
            for(int j=0;j<n;j++){
                 if(arr[j]!=j+1){
                     return new int[]{arr[j],j+1};
                 }

            }
            return new int[]{-1,-1};
    }
    public static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        int[] ans=findMissing(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
