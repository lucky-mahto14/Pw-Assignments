public class DiStringMatch{
     public static int[] diStringMatch(String s) {
        int n=s.length();
        int iind=0,dind=n;
        int []arr=new int[n+1];
        int i=0;
        for(;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='I'){
                arr[i]=iind;
                iind++;
            }
            else{
                arr[i]=dind;
                dind--;
            }
        }
        arr[i]=iind;
        return arr;
    }
}
