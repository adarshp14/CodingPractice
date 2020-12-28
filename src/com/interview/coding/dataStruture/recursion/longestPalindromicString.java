package com.interview.coding.dataStruture.recursion;

public class longestPalindromicString {

  public static String longestPalindrome(String s) {
    /*
     Input s="babababad"
              babababad
     Output "babababa"
    */

    String temp=s;
    String res="";
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==s.charAt(i+2))
      {
        res+=s.charAt(i);
        res+=s.charAt(i+1);
      }
      else
      {
        break;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    System.out.println(longestPalindrome("babad"));
    int[] arr=new int[10];
    System.out.println("Arr::"+arr.length);
  }
}
