package com.interview.coding.codeForceDiv2;

import java.util.Scanner;

public class wizard2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        while(input>0)
        {
            int n=sc.nextInt();
            for(int i=0;i<n;i++) {
                if (i == 0) {
                    System.out.print(9);
                    continue;

                }
                System.out.print((7+i)%10);
            }
            input--;
            System.out.println();

        }

    }

}
