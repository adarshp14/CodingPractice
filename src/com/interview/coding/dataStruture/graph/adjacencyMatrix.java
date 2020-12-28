package com.interview.coding.dataStruture.graph;

public class adjacencyMatrix {
    public static void main(String[] args) {
        int[][] startingMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                startingMatrix[i][j] = 0;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(startingMatrix[i][j]);
                if(j!=3)
                {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

}
