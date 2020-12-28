package com.interview.coding.dataStruture.string;

import java.util.HashMap;

public class romanToInt {
    public static void main(String[] args) {
        System.out.println(romanToIntConverter("MCDLXXVI"));
        //m->1000
        //cd->400
        //lx->40+16
    }

    public static int romanToIntConverter(String s) {

        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int result = 0;
       for (int i=0;i<s.length();i++)
       {
           if(i>0 && roman.get(s.charAt(i))>roman.get(s.charAt(i-1)))
           {
               result+=roman.get(s.charAt(i))-2*roman.get(s.charAt(i-1));
           }
           else result+=roman.get(s.charAt(i));
       }
        return result;
    }


}

