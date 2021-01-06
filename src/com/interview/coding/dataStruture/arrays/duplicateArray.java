package com.interview.coding.dataStruture.arrays;

public class duplicateArray {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,3,1,4};
        System.out.println(checkDuplicate(arr));

    }
    public static int checkDuplicate(int[] arr)
    {
        int result=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            result=result^arr[i];
        }

        return result;
    }
}
