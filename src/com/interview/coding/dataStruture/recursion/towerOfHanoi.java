package com.interview.coding.dataStruture.recursion;

public class towerOfHanoi {
    public static void main(String[] args) {
        movesForTowerOfHanoi(154,'A','B','C');
    }

    public static void movesForTowerOfHanoi(int disk, char a, char b, char c) {
        if(disk==0)

        {
            System.out.println("Plate "+disk+" from "+a+" to "+c);
            return;
        }

        movesForTowerOfHanoi(disk-1,a,c,b);
        System.out.println("Plate "+disk+" from "+a+" to "+c);
        movesForTowerOfHanoi(disk-1,b,a,c);
    }
}
