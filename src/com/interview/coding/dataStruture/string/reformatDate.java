package com.interview.coding.dataStruture.string;

import java.util.HashMap;
import java.util.Map;

public class reformatDate {
    public static void main(String[] args) {
        System.out.println(reformatDate("6th Jun 1933"));
    }
    public static String reformatDate(String date) {
        Map<String, String> month = new HashMap<>();
        String s = "";
        month.put("Jan", "01");
        month.put("Feb", "02");
        month.put("Mar", "03");
        month.put("Apr", "04");
        month.put("May", "05");
        month.put("Jun", "06");
        month.put("Jul", "7");
        month.put("Aug", "8");
        month.put("Sep", "9");
        month.put("Oct", "10");
        month.put("Nov", "11");
        month.put("Dec", "12");

        if (date.charAt(3) >= 65) {
            for (int i = 9; i < 13; i++) {
                s += date.charAt(i);
            }
            s+="-";
            String temp = "";
            for (int i = 5; i < 8; i++) {
                temp += date.charAt(i);
            }
            s += month.get(temp);
            s+="-";
            for (int i = 0; i < 2; i++) {
                s += date.charAt(i);
            }


        } else if (date.charAt(1) >= 65) {
            for (int i = 8; i < 12; i++) {
                s += date.charAt(i);
            }
            s+="-";
            String temp = "";
            for (int i = 4; i < 7; i++) {
                temp += date.charAt(i);
            }
            s += month.get(temp);
            s+="-";
            for (int i = 0; i < 1; i++) {
                s += date.charAt(i);
            }



        }
        return s;
    }
}
