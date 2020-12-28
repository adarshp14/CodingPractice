package com.interview.coding.dataStruture.arrays;

import java.util.Map;
import java.util.TreeMap;

public class missingPostive {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
        public static int firstMissingPositive(int[] nums) {
            if(nums.length==0) return 1;
            int i=0;
            while(i<nums.length)
            {
                if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1])
                {
                    int otherIndex=nums[i]-1;
                    int x=nums[i];
                    nums[i]=nums[otherIndex];
                    nums[otherIndex]=x;
                }
                else
                {i++;}
            }
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]!=i+1) return i+1;
            }

            Map<Integer,Integer> newMaps=new TreeMap<Integer, Integer>();
            newMaps.keySet();


            return nums.length+1;
        }


}
