package com.interview.coding.dataStruture.string;

import java.util.Scanner;

public class capitalWord {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        if((int)s.charAt(0)>=65&&(int)s.charAt(0)<=90)
        {
            System.out.println(s);
        }
        else
        {
           char temp= (char) (s.charAt(0)-32);
           s=temp+s.substring(1,s.length());
            System.out.println(s);
        }

    }
}
