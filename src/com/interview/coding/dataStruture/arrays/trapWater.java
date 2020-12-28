package com.interview.coding.dataStruture.arrays;


import java.util.Arrays;

public class trapWater {

    public static void main(String[] args) {
        int [] input={4,2,0,3,2,5};
        System.out.println(trap(input));
    }
    public static int trap(int[] height) {
        int [] prefix=new int[height.length];
        int[] suffix=new int[height.length];
        int max1=0;
        int max2=0;

        for(int i=0;i<height.length;i++)
        {
            if(height[i]>max1)
            {
                max1=height[i];

            }
            prefix[i]=max1;
        }
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>max2)
            {
                max2=height[i];

            }
            suffix[i]=max2;
        }
        System.out.println(Arrays.toString(suffix));
        System.out.println(Arrays.toString(prefix));
        int result=0;
        for(int i=0;i<height.length;i++)
        {
            result+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return result;
    }
}
