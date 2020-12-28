package com.interview.coding.dataStruture.sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] input={57,89,12,98,43};
        sortNumbers(input);
        System.out.println(Arrays.toString(input));
    }

    public static void sortNumbers(int[] input)
    {
        for(int i=0;i<input.length;i++)
        {
            for(int j=i;j<input.length;j++)
            {
                if(input[i]>input[j])
                {
                    int temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
        }
    }
}
