package com.interview.coding.dataStruture.digital;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class returnMaxDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float[] input=new float[n];
        for(int i=0;i<n;i++)
        {
            float input1=sc.nextFloat();
            input[i]=input1;
        }
        System.out.println(Arrays.toString(returnTopThree(input)));


    }
    public static float[] returnTopThree(float[] input)
    {
        Arrays.sort(input);
        float distance= (float) 42.195;
        float[] finalOutput=new float[3];
        int count=0;
        for(int i=input.length-1;i>=0;i--)
        {
         if(input[i]!=distance && count!=3 )
         {
             if(input[i]<0) return null;
             finalOutput[count]=input[i];
             count++;
         }

        }
        return finalOutput;


    }
}
