package com.interview.coding.dataStruture.arrays;

import java.util.Map;
import java.util.TreeMap;

public class majorityElementApproach2 {
    int[] arr;

    public static void main(String[] args) {
        int[] arr={1,1,2,2,1,1};
        MajorityChecker majorityChecker=new MajorityChecker(arr);
        // System.out.println(majorityChecker.query(0,5,6)); // returns 1
        System.out.println(majorityChecker.query(0,3,3)); // returns -1
       // System.out.println( majorityChecker.query(2,8,5));//returns 2
    }

    public majorityElementApproach2(int[] arr) {
        this.arr = arr;
    }

    public int query(int left, int right, int threshold) {
        int count = 0;
        int candidate=0;
        for(int i=left;i<=right;i++)
        {
            if(count==0)
            {
                candidate=arr[i];
            }
            if (arr[i]==candidate)
                count+=1;
            else count-=1;
        }
        if(count==threshold)

        return candidate;

        return -1;
    }

}

