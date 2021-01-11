package com.interview.coding.dataStruture.dynamicProg;

/*
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
        Output: 6
        Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].

 */
public class minCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairsResult(cost));
    }

    public static int minCostClimbingStairsResult(int[] cost) {
         for(int i=2;i<cost.length;i++)
         {
             cost[i]+=Math.min(cost[i-1],cost[i-2]);

         }
         return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }

}
