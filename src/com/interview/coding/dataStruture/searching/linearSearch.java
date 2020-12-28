package com.interview.coding.dataStruture.searching;

public class linearSearch {
    public static void main(String[] args) {
        int[] input = {45, 88, 98, 12, 56};
        int target = 98;
        System.out.println(linearSearchItem(input, target));
    }

    public static int linearSearchItem(int[] input, int target) {
        int i;
        for (i = 0; i < input.length; i++) {
            if (input[i] == target) {
                break;

            }
        }
        return i + 1;
    }
}
