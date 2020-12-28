package com.interview.coding.dataStruture.string;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class boyerMoore {
    public static void main(String[] args) {
        String input = "Mya name is adarsh pandey";
        String pattern = "adarsh pandey";
        System.out.println(search(input, pattern));


    }

    public static HashMap<Character, Integer> preComputeTable(String pattern) {
        int lengthOfPattern = pattern.length();
        HashMap<Character, Integer> finalTable = new HashMap<>();
        for (int i = 0; i < lengthOfPattern; i++) {
            char actualChar = pattern.charAt(i);
            int maxShift = Math.max(1, lengthOfPattern - i - 1);
            finalTable.put(actualChar, maxShift);

        }
        return finalTable;
    }

    public static int search(String input, String pattern) {
        HashMap<Character, Integer> preTable = new HashMap<>();
        preTable=preComputeTable(pattern);
        int numOfSkips;

        for (int i = 0; i <= input.length() - pattern.length(); i = i + numOfSkips) {
            numOfSkips = 0;

            for (int j = pattern.length() - 1; j >= 0; j--) {
                if (pattern.charAt(j) != input.charAt(i + j)) {
                    if (preTable.get(pattern.charAt(j)) != null) {
                        numOfSkips = preTable.get(pattern.charAt(j));
                        break;
                    } else {
                        numOfSkips = pattern.length();
                        break;
                    }
                }
            }
            if (numOfSkips == 0) return i;
        }
        return input.length();
    }
}
