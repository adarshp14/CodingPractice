package com.interview.coding.dataStruture.arrays;

import java.util.ArrayList;

public class duplicateInArray {
  public static void main(String[] args) {
    int[] arr = {2,3,1,2,4,3};
    ArrayList<Integer> finalList = new ArrayList<>();
    finalList = findDuplicates(arr);
    for (int i :finalList ) {
      System.out.println(i);
    }
  }

  public static ArrayList<Integer> findDuplicates(int[] input) {
    ArrayList<Integer> listOfDuplicates = new ArrayList<>();
    for (int i = 0; i < input.length; i++) {
      if (input[Math.abs(input[i])] > 0) {
        input[Math.abs(input[i])] = -input[Math.abs(input[i])];
      } else {
        listOfDuplicates.add(Math.abs(input[i]));
      }
    }
    return listOfDuplicates;
  }
}
