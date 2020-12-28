package com.interview.coding.dataStruture.string;

import java.math.BigInteger;

public class reverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInt(96464351));
    }
    public static int reverseInt(int a)
    {
        String s=String.valueOf(a);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(sb.charAt(sb.length()-1)=='-')
        {
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0,'-');
        }

        s=sb.toString();
        long l = Long.parseLong(s);
        return (int) l;
    }
}
