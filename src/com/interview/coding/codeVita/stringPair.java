/*package whatever //do not write package name here */
package com.interview.coding.codeVita;
import java.util.*;
import java.lang.*;
import java.io.*;

class stringPair {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        while(input>0)
        {
            sc.nextLine();
            String s=sc.nextLine();

           String temp= s.replaceAll("[^0-9]"," ");

            String[] temp1= temp.split(" ");
            int[] arr=new int[temp1.length];
            for(int i=0;i<temp1.length;i++)
            {
                if(temp1[i].startsWith("9"))
                {
                    temp1[i]=null;
                }
                else if(temp1[i]!="")
                {
                    arr[i]=Integer.parseInt(temp1[i]);
                }
            }
            Arrays.sort(arr);
            if(arr.length>0)
            {
                System.out.println(arr[arr.length-1]);
            }
            else
            {
                System.out.println("-1");
            }
            input--;
        }
    }
}