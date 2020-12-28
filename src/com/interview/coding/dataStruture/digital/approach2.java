package com.interview.coding.dataStruture.digital;

import java.io.*;
import java.util.*;

class approach2 {

    // Function to check whether the
// string is super ASCII or not
    public static void checkSuperASCII(String s)
    {

        // Stores the frequency count
        // of characters 'a' to 'z'
        int b[] = new int[26];

        // Traverse the string
        for(int i = 0; i < s.length(); i++)
        {

            // AscASCIIii value of the
            // current character
            int index = (int)s.charAt(i) - 97 + 1;

            // Count frequency of each
            // character in the string
            b[index - 1]++;
        }

        // Traverse the string
        for(int i = 0; i < s.length(); i++)
        {

            // ASCII value of the current
            // character
            int index = (int)s.charAt(i) - 97 + 1;

            // Check if the frequency of
            // each character in string
            // is same as ASCII code or not
            if (b[index - 1] != index)
            {
                System.out.println("No");
                return;
            }
        }

        // Else print "Yes"
        System.out.println("Yes");
    }

    // Driver Code
    public static void main(String args[])
    {

        // Given string S
        String s = "bba";

        // Function Call
        checkSuperASCII(s);
    }
}