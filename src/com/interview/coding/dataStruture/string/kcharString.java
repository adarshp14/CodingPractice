package com.interview.coding.dataStruture.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class kcharString {
    public static void main(String[] args) {
        String s = "aaa";
        int k = 3;
        System.out.println(longestSubstring(s, k));

    }

    public static int longestSubstring(String s, int k) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charCount.containsKey(s.charAt(i))) {
                charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
            } else {
                charCount.put(s.charAt(i), 1);
            }
        }
        HashSet<Character> lessChar = new HashSet<>();
        for (Character c : charCount.keySet()) {
            int i = charCount.get(c);
            if (charCount.get(c) < k+1) {
                lessChar.add(c);
            }
        }
        int len = 0;
        int longest = 0;
        int max = 0;
        int count = 0;
        while (count < s.length()) {
            if (!lessChar.contains(s.charAt(count))) {
                len++;

            }
            else
            {
                len=0;
            }
            if(len>max)
            {
                max=len;
            }

            count++;
        }
        return max;
    }
}