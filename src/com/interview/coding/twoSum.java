package com.interview.coding;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

  public static int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> result = new HashMap<>();
    int[] res=new int[2];

    for (int i=0;i<numbers.length;i++)
    {
      result.put(target-numbers[i],i+1);
    }
    for(int i=0;i<numbers.length;i++)
    {
      if (result.containsKey(numbers[i])){
        res[0]=i+1;
        res[1]=result.get(numbers[i]);
        return res;
      }
    }
   return res;
  }

  public static void main(String[] args) {
    int[] numbers = {2,3,4};
    int target = 6;
    int[] res = twoSum(numbers, target);
    for (int i : res) {
      System.out.println(i);
    }
  }
}
