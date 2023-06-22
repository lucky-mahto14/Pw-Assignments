package com.company;
import java.util.ArrayList;
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
                count++;
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
