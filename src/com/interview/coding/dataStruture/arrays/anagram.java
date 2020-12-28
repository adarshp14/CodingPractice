package com.interview.coding.dataStruture.arrays;

import java.util.Arrays;

public class anagram {
  public static void main(String[] args) {

    System.out.println(isAnagram("adarsh", "hsrada"));
  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    char[] tempS = s.toCharArray();
    char[] tempT = t.toCharArray();
    Arrays.sort(tempS);
    Arrays.sort(tempT);
    for (int i = 0; i < tempS.length; i++) {
      if (tempS[i] != tempT[i]) return false;
    }
    return true;
  }
}
