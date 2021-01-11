package com.interview.coding.codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class maxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int len=sc.nextInt();
            int div=sc.nextInt();
            List<Integer> list2 = new ArrayList<>();
            int [] arr=new int[len];
            for (int i=0;i<len;i++) {
                if (sc.hasNextInt()) {
                    int temp = sc.nextInt();
                    list2.add(temp);
                }
            }
            System.out.println(sumOfValue(list2,div));
            n--;
        }
    }

    private static int sumOfValue(List<Integer> list2, int div) {
        int count=0;
        int sum=0;

        double test=Math.random();

        while(list2.get(count)%div==0) {
            sum += list2.get(count);
            if ((list2.get(count) / div) % div == 0)
            {
                for (int i = 0; i < div; i++) {
                    list2.add(list2.get(count) / div);
                }

        }
            else
            {
                for (int i=0;i<div;i++)
                {
                    sum+=list2.get(count)/2;
                }
            }
            count++;
        }
        for(int i=count;i<list2.size();i++)
        {
            sum+=list2.get(i);
        }

        return sum;
    }
}
