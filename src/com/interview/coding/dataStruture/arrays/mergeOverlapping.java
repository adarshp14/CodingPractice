package com.interview.coding.dataStruture.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class mergeOverlapping {
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(input));

    }
    public static int eraseOverlapIntervals(int[][] intervals) {
if(intervals==null || intervals.length==0) {
    return 0;
}
else {

    Arrays.sort(intervals, new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            return a[0] - b[0];
        }
    });

}
        return 0;
}

}
