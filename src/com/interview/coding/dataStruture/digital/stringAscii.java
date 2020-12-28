package com.interview.coding.dataStruture.digital;

import java.util.HashMap;

public class stringAscii {
    public static void main(String[] args) {
    String s="bba";
        System.out.println(checkSuperString(s));
    }

    private static boolean checkSuperString(String s) {
        HashMap<Character, Integer> asciiMap=new HashMap<>();
        asciiMap.put('a',1);
        asciiMap.put('b',2);

        HashMap<Character, Integer> containVal=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(containVal.containsKey(s.charAt(i)))
            {
               int count= containVal.get(s.charAt(i));
               count++;
               containVal.put(s.charAt(i),count);
            }
            else
            {
                containVal.put(s.charAt(i),1);
            }
        }
        return containVal.equals(asciiMap);

    }

}
