package com.interview.coding.dataStruture.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class medianFinder {


        /** initialize your data structure here. */
        static ArrayList<Integer> list=new ArrayList<Integer>();

        public medianFinder() {

        }

    public static void main(String[] args) {

        System.out.println(1/2);
        list.add(1);
        list.add(2);
        int size=list.size();
        int val1=list.get(size/2);
        int val2=list.get((size-1)/2);

        double median= median=(double) (val1+val2)/2;
        System.out.println(median);
    }
        public void addNum(int num) {
            list.add(null);

        }

        public double findMedian() {
            double median=0;
            Collections.sort(list);
            int size=list.size();
            if(size%2==0)
            {
                median=(list.get(size/2)+list.get((size-1)/2))/2;
            }
            else
            {
                median=list.get((size)/2);
            }
            return median;
        }



}
