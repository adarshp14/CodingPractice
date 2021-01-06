package com.interview.coding.dataStruture.stack;

import java.util.Stack;

public class wellFormedBrackets {
    public static void main(String[] args) {
        String s = "()(()";
        System.out.println(validBracket(s));
    }

    public static int validBracket(String s) {
        Stack<Character> input = new Stack<>();
        int len = s.length() - 1;
        int i = 0;
        int valid = 0;
        while (len >= 0) {
            if (s.charAt(i) == '(') {
                input.push(s.charAt(i));
            } else {
                if (!input.isEmpty()) {
                    input.pop();
                    valid += 2;
                }
            }
            i++;
            len--;

        }
        return valid;
    }
}
