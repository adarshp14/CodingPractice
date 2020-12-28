package com.interview.coding.dataStruture.maps;

import java.util.HashMap;

public class minStepToAnagram {
    public static void main(String[] args) {
        System.out.println(minSteps("gctcxyuluxjuxnsvmomavutrrfb", "qijrjrhqqjxjtprybrzpyfyqtzf"));
    }

    public static int minSteps(String s, String t) {
        HashMap<Character, Integer> res = new HashMap<>();
        HashMap<Character, Integer> target = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (res.containsKey(s.charAt(i))) {
                int temp = res.get(s.charAt(i));
                temp++;
                res.put(s.charAt(i), temp);
            } else {
                res.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (target.containsKey(t.charAt(i))) {
                int temp = target.get(t.charAt(i));
                temp++;
                target.put(t.charAt(i), temp);
            } else {
                target.put(t.charAt(i), 1);
            }
        }
        int finalVal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (target.containsKey(s.charAt(i))) {
                int count1 = target.get(s.charAt(i));
                int count2 = res.get(s.charAt(i));
                if (count1 <= count2) {
                    finalVal += Math.abs(count1 - count2);
                    target.put(s.charAt(i),0);
                    res.put(s.charAt(i),0);
                }
            } else {
                int count = res.get(s.charAt(i));
                finalVal += count;
                target.put(s.charAt(i),count);
            }
        }
        return finalVal;
    }
}
