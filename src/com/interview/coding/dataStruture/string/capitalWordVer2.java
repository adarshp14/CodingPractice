package com.interview.coding.dataStruture.string;

import java.util.Scanner;

public class capitalWordVer2 {

            public static void main(String[] args) {
                String s;
                Scanner sc=new Scanner(System.in);
                s=sc.next();
                if(Character.isLowerCase(s.charAt(0)))
                {
                    s=Character.toUpperCase(s.charAt(0))+s.substring(1,s.length());
                }
                System.out.println(s);

            }
        }



