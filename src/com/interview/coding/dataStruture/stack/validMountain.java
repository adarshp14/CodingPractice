package com.interview.coding.dataStruture.stack;

public class validMountain {

  public static void main(String[] args) {
    int[] arr={9,8,7,6,5,4,3,2,1,0};
    System.out.println(ValidMountain(arr));
  }

  public static boolean ValidMountain(int[] arr) {
    if (arr.length < 3) return false;

    int i = 0;
    while (arr[i] < arr[i + 1]) {
      i++;
      if (arr.length - 1 == i) return false;

    }

    int j;
    if (i != arr.length - 1 && i!=0) {
      j = i;

      while (arr[j] > arr[j + 1]) {
        j++;
        if (arr.length - 1 == j) break;

      }

      if (j == arr.length - 1) {
        return true;
      }
}
    return false;
  }
}
