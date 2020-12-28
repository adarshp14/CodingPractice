package com.interview.coding.dataStruture.stack;

import java.util.Stack;

public class invalidBracket {
  public static void main(String[] args) {
    String input = "(a + b) + ((c + d))";
    System.out.println(checkStack(input));
  }

  public static boolean checkStack(String s) {
    Stack<Character> containBracket = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.equals("(")) {
        containBracket.push(s.charAt(i));
      } else if (s.equals(")")) {
        containBracket.pop();
      }
      else if(s.equals("{"))
      {
        containBracket.push(s.charAt(i));
      }
      else if(s.equals("}"))
      {
        containBracket.pop();
      }
      else if(s.equals("["))
      {
        containBracket.push(s.charAt(i));
      }
      else if(s.equals("]"))
      {
        containBracket.pop();
      }

    }
    if (containBracket.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
