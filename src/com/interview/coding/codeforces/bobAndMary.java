package com.interview.coding.codeforces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bobAndMary {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        while (in > 0) {
            int count = sc.nextInt();
            ArrayList<Integer> inputs=new ArrayList<>();
            for (int i = 0; i < count; i++) {
                int temp=sc.nextInt();
                inputs.add(temp);
            }
            System.out.println(findWinner(inputs));
            in--;
        }
    }

    private static String findWinner(ArrayList<Integer> arr) {
        String alice="Alice";
        String bob="Bob";
        String tie="Tie";
        int aliceScore=0;
        int bobScore=0;
        boolean aliceChance=true;
        boolean bobChance=false;
        int chancesLeft=arr.size();
        Collections.sort(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        while(chancesLeft>0)
        {
            if(aliceChance)
            {
                int max=arr.get(chancesLeft-1);
                arr.remove(chancesLeft-1);
                if(max%2==0)
                {
                    aliceScore+=max;
                }



               aliceChance=false;
               bobChance=true;
            }
            else if(bobChance)
            {
                int max=arr.get(chancesLeft-1);
                arr.remove(chancesLeft-1);


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
