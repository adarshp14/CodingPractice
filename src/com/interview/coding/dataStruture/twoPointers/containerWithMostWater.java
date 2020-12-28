package com.interview.coding.dataStruture.twoPointers;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height={4,3,2,1,4};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int endPoint=height.length-1;
        int startPoint=0;
        int maxWater=0;
        while(startPoint!=endPoint)
        {
            int water=(endPoint-startPoint)*Math.min(height[endPoint],height[startPoint]);
            if(height[startPoint]>height[endPoint]) endPoint--;
            else startPoint++;
            if(water>maxWater)
            {
                maxWater=water;
            }
        }
        return maxWater;
    }
}

