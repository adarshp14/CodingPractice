package com.interview.coding.dataStruture.stack;

import java.util.Stack;

public class balancedBracket {
  public static void main(String[] args) {
    //
      String s="([)]";
    System.out.println(checkBalancedBracket(s));
  }
  public static  boolean checkBalancedBracket(String input)
  {
      Stack<Character> bracketList=new Stack<>();
      for(int i=0;i<input.length();i++)
      {
      if (input.equals("(")||input.equals("{")||input.equals("["))
      {
          bracketList.push(input.charAt(i));
      }
      else if(input.equals(")")||input.equals("}")||input.equals("]"))
      {
          bracketList.pop();
      }
      }
      return bracketList.isEmpty();
  }
}
