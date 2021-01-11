package com.interview.coding.codeForceDiv2;

import java.util.Scanner;

public class wizardOfOrz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextInt();
        while (input > 0) {
            long arrSize = sc.nextInt();
            System.out.println(returnMax(arrSize));
            input--;
        }
    }

    private static String returnMax(long n) {
        int[] a = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        StringBuilder s = new StringBuilder("9");

        if (n == 1) {

            return s.toString();
        }
        else {

            int x = 8;

            for (int i = 0; i < n - 1; i++) {


                s.append(a[x++]);

                if (x == 10) {

                    x = 0;

                }

            }
            return s.toString();
        }

    }

}
