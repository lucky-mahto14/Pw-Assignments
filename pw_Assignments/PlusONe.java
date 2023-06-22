public class PlusONe {
    public static int[] incrementByOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            else if(digits[i]==9){
                digits[i]=0;
            }

        }
        int[] arr=new int[n+1];
        arr[0]=0;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2,8,9};
       int[] ans=incrementByOne(arr);
       for(int i:ans){
           System.out.print(i+" ");
       }
    }
}
