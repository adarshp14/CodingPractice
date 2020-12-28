package com.interview.coding.dataStruture.arrays;

public class binarySearch {

    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int target=2;
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int leftPointer=0;
        int rightPointer=nums.length-1;
        int middlePointer;
        while(leftPointer<=rightPointer) {
            middlePointer = leftPointer + ((rightPointer - leftPointer) / 2);
            if (nums[middlePointer] == target) return middlePointer;
            else if (nums[middlePointer] > target) rightPointer = middlePointer - 1;
            else
                leftPointer = middlePointer + 1;


        }
        return -1;
    }
}
