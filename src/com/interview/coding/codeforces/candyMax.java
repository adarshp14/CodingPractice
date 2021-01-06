package com.interview.coding.codeforces;

import java.util.Scanner;

public class candyMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        while (in > 0) {
            int count= sc.nextInt();
            int [] arr=new int[count];
            for (int i=0;i<count;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(findCandies(count, arr));
            in--;
        }
    }

    private static String findCandies(int count, int[] arr) {
        int sumOfArray=0;
        for (int i:
             arr) {
            sumOfArray+=i;
        }
        if(count %2==0 && sumOfArray%2==0)
        {
            return "YES";

        }

        return "NO";
    }
}
