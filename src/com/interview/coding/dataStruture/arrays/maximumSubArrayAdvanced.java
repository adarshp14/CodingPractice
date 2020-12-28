package com.interview.coding.dataStruture.arrays;

import java.util.*;

public class maximumSubArrayAdvanced {
  public static void main(String[] args) {
    //
      int[] input={5,4,2};
      int sizeArray=3;
      int operationNumber=2;
    System.out.println(checkSum(input,sizeArray,operationNumber));
  }

  static int checkSum(int[] inputArray, int sizeArray, int operationNumber) {
    Arrays.sort(inputArray);


    int sum = 0;
    int k = operationNumber;
    while (k > 0) {
        int j=1;
        int i = sizeArray - 1;
        ArrayList<Integer> newList=new ArrayList<>();
      while (j <= sizeArray) {
        int multiplier = ((sizeArray - j) * operationNumber) + 1;
        int finalValue = multiplier * inputArray[i];
        for(int loop=0;loop<multiplier;loop++)
        {
            newList.add(inputArray[i]);
        }
        sum += finalValue;
        i--;
        j++;
      }
      Collections.sort(newList);
        k--;
    }

      return sum;
  }
}
