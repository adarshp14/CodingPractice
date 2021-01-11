package com.interview.coding.dataStruture.dynamicProg;

public class climbingStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        int[] dp=new int[n+1];
        return climbStairsDp(n,dp);
    }

    public static int climbStairsDp(int n,int[] dp)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }

        if(dp[n]>0)
        {
            return dp[n];
        }

        int ans1=climbStairsDp(n-1,dp);
        int ans2=climbStairsDp(n-2,dp);
        dp[n]=ans1+ans2;

        return ans1+ans2;
    }
}

