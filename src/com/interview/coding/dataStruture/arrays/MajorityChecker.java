package com.interview.coding.dataStruture.arrays;

import java.util.Map;
import java.util.TreeMap;

public class MajorityChecker {
    int[] arr;

    public static void main(String[] args) {
        int[] arr={2,1,2,1,2,2,2,2,2,1,2,2,1,1,1,1,2,1,1,1,1,2};
        MajorityChecker majorityChecker=new MajorityChecker(arr);
       // System.out.println(majorityChecker.query(0,5,6)); // returns 1
       //System.out.println(majorityChecker.query(0,3,3)); // returns -1
        System.out.println( majorityChecker.query(2,8,5));//returns 2
    }

    public MajorityChecker(int[] arr) {
        this.arr = arr;
    }

    public int query(int left, int right, int threshold) {
        int count = 0;
        Map<Integer, Integer> occurenceCount = new TreeMap<>();
        for (int i = left; i <= right; i++) {
            int temp=0;
            if (occurenceCount.containsKey(arr[i])) {
                temp = occurenceCount.get(arr[i]);
                temp++;
                occurenceCount.put(arr[i], temp);


            } else {
                occurenceCount.put(arr[i], 1);
            }
            if(temp>=threshold)
                break;
        }

     int value=0;
        int key=0;

       for(int s:occurenceCount.keySet())
       {
           if(occurenceCount.get(s)>=threshold)
           {
               count++;
               value=s;

           }
       }
       if(count==1) return value;
       return -1;
    }

}

