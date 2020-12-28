package com.interview.coding.dataStruture.searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] input = {33,66,99};
        System.out.println(binarySearchItem(input, 1));
    }

    public static int binarySearchItem(int[] input, int target) {
        int low = 0, high = input.length - 1, mid = (high + low) / 2;

        while (low <= high) {
            if (input[mid] > target) {
                high = mid;
                mid = (low + high) / 2;
            } else if (input[mid] < target) {
                low = mid;
                mid = (low + high) / 2;
            } else if (input[mid] == target) return mid;
        }
        return -1;
    }
}
