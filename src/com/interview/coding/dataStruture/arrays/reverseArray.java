package com.interview.coding.dataStruture.arrays;

public class reverseArray {

  public static void main(String[] args) {
    //
    int[] arr = {1, 2, 3};
    reveArray(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  private static int[] reveArray(int[] input) {
    int start = 0;
    int end = input.length - 1;
    while (start < end) {
      int temp = input[start];
      input[start] = input[end];
      input[end] = temp;
      start++;
      end--;
    }
    return input;
  }
}
