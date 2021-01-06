package com.interview.coding.codeforces;

import java.util.Scanner;

public class paperMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        while (in > 0) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            int n = sc.nextInt();
            int paper=findPaper(width, height);
            if(paper>=n) System.out.println("YES");
            else System.out.println("NO");
            in--;
        }
    }

    public static int findPaper(int width, int height) {
    if(width%2==0)
    {
        return 2*findPaper(width/2,height);
    }
    if(height%2==0)
    {
        return 2*findPaper(width,height/2);
    }
    return 1;
    }

}
