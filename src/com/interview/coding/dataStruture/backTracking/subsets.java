package com.interview.coding.dataStruture.backTracking;

import java.util.*;

public class subsets {

    static List<List<Integer>> res=new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        int[] input={1,2,3};
        List<List<Integer>> res=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<>();

        res=subs(input);
        for(int i=0;i<res.size();i++)
        {
            for(int j=0;j<res.get(i).size();j++)
            {
                System.out.print(res.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static  List<List<Integer>> subs(int[] nums)
    {
        int[][] arr=new int [5][5];
        int n=arr[0][arr.length];
        if(nums.length==0)
        {
            return res;
        }
        backtrackSets(0,new ArrayList<Integer>(),nums);
        return res;
    }
    public static void backtrackSets(int start, ArrayList<Integer> curr,int[] nums)
    {

        res.add(new ArrayList<Integer>(curr));
        for(int i=start;i<nums.length;i++)
        {
            curr.add(nums[i]);
            backtrackSets(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }

}
