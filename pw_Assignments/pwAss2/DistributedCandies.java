import java.util.HashSet;
public class DistributedCandies{
    public  static int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int candy=set.size();
        int limit=candyType.length/2;
        if(candy>limit){
            return limit;
        }
        else{
            return candy;
        }
    }
    public static void main(String args[]){
        int[] candies={1,1,2,2,3,3};
        System.out.println(distributeCandies(candies));
    }
}