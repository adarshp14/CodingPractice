package com.interview.coding.dataStruture.arrays;

public class maxSumAtPosition {
  public static void main(String[] args) {
    int max_sum=7;
    int size=3;
    int pos=1;
    System.out.println(FindMaxAtK(pos,max_sum,size));
  }

    public static int FindMaxAtK(int k, int max_sum, int n) {
        int[] array = new int[n];
        array[k] = max_sum;

        for (int i = k-1; i >= 0; i--) {
            array[i] = array[i+1] - 1;
        }
        for (int i = k+1; i < n; i++) {
            array[i] = array[i-1] - 1;
        }

        while (array.Sum() > max_sum) {
            for (int i = 0; i < array.length; i++) {
                array[i]--;
            }
        }

        return array[k];
    }
}
