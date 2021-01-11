package com.interview.coding.dataStruture.string;

public class reverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
    public static String reverseWords(String s) {
        StringBuilder result= new StringBuilder();
    String[] res=s.split(" ");
    for(int i=res.length-1;i>=0;i--)
    {
        if(!res[i].isBlank())
        result.append(res[i]);
        if(i!=0)
        if(!res[i-1].isBlank() )
        {

            result.append(" ");
        }
    }
   return result.toString();
    }
}
