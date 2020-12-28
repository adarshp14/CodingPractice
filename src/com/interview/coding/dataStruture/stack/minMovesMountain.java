package com.interview.coding.dataStruture.stack;

public class minMovesMountain {
  public static void main(String[] args) {
    int[] arr = {2, 1, 1, 5, 6, 2, 3, 1};
    System.out.println(makeMountain(arr));
  }

  public static int makeMountain(int[] arr) {
    if (checkAlreadyMountain(arr))
      return  0;
    return 1;
  }

  public static boolean checkAlreadyMountain(int[] arr) {
    int i = 0;
    while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
      i++;
    }
    if (i == 0 || i == arr.length - 1) {
      return false;
    }
    while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
      i++;
    }
    return i == arr.length - 1;
  }
}
