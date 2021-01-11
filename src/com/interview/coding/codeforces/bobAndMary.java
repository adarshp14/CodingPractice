//package com.interview.coding.codeforces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bobAndMary {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        var test=5;
        while (in > 0) {
            int count = sc.nextInt();
            ArrayList<Long> inputs=new ArrayList<>();
            for (int i = 0; i < count; i++) {
                long temp=sc.nextInt();
                inputs.add(temp);
            }
            System.out.println(findWinner(inputs));
            in--;
        }
    }

    private static String findWinner(ArrayList<Long> arr) {
        String alice="Alice";
        String bob="Bob";
        String tie="Tie";
        long aliceScore=0;
        long bobScore=0;
        boolean aliceChance=true;
        boolean bobChance=false;
        long chancesLeft=arr.size();
        while(chancesLeft>0)
        {
            if(aliceChance)
            {
                long max=Integer.MIN_VALUE;
                int index=0;
                for(int i=0;i<arr.size();i++)
                {
                    if(arr.get(i)>max)
                    {
                        max= arr.get(i);
                        index=i;
                    }
                }
                arr.remove(index);
                if(max%2==0)
                {
                    aliceScore+=max;
                }
                aliceChance=false;
                bobChance=true;
            }
            else if(bobChance)
            {
                long max=Integer.MIN_VALUE;
                int index=0;
                for(int i=0;i<arr.size();i++)
                {
                    if(arr.get(i)>max)
                    {
                        max= arr.get(i);
                        index=i;
                    }
                }
                arr.remove(index);
                if(max%2!=0)
                {
                    bobScore+=max;
                }
                aliceChance=true;
                bobChance=false;
            }
            chancesLeft--;
        }
        if(bobScore>aliceScore)
        {
            return bob;
        }
        else if(aliceScore>bobScore)
        {
            return alice;
        }
        else
        {
            return tie;
        }

    }
}
