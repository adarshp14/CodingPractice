package com.interview.coding.dataStruture.string;

import java.util.HashMap;

public class stringToInt {

    public static void main(String[] args) {
        System.out.println(myAtoi("53"));
    }
    public static int myAtoi(String s) {
        int res = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 9 || s.charAt(i) == '+' || s.charAt(i) == '-') {
                stringBuilder.append(s.charAt(i));
            }
        }
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(0, '0');
        map.put(1, '1');
        map.put(2, '2');
        map.put(3, '3');
        map.put(4, '4');
        map.put(5, '5');
        map.put(6, '6');
        map.put(7, '7');
        map.put(8, '8');
        map.put(9, '9');

        int count = 1;
        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            map.get(stringBuilder.charAt(i));
            if ((res + map.get(stringBuilder.charAt(i) * count) > Integer.MAX_VALUE)) {
                return Integer.MIN_VALUE;
            }

            count = count * 10;
        }
        
        return res;
    }
}
