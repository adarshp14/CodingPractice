package com.interview.coding.dataStruture.string;

public class subString_bruteForce {
    public static void main(String[] args) {
        String input="My name is Adarsh";
        String pattern=" ";
        System.out.println(returnStartingIndex(input,pattern));
    }
    public static int returnStartingIndex(String input,String pattern)
    {
        for(int i=0;i<=input.length()-pattern.length();i++)
        {
            int j;
            for(j=0;j<pattern.length();j++)
            {
              if(input.charAt(i+j)!=pattern.charAt(j))
              {
                  break;
              }
            }
            if(j==pattern.length()) return i;
        }
        return input.length();
    }
}
