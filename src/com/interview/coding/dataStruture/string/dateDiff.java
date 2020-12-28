package com.interview.coding.dataStruture.string;

public class dateDiff {

    public static void main(String[] args) {
        String date1 = "2020-01-15", date2 = "2019-12-31";
        System.out.println(daysBetweenDates(date1,date2));
    }
    public static int daysBetweenDates(String date1, String date2)
    {

        // date1 = "2019-06-29", date2 = "2019-06-30"

        int year1=Integer.parseInt(date1.substring(0,3));
        int year2=Integer.parseInt(date2.substring(0,3));
        int yearDifference=Math.abs(year1-year2);
        if(yearDifference>1)
        {
            yearDifference=yearDifference*365;

        }
        else {
            yearDifference=0;
        }

        // month difference

        int month1=Integer.parseInt(date1.substring(5,6));
        int month2=Integer.parseInt(date2.substring(5,6));
        int monthDifference=Math.abs(month1-month2)*30;

        int dateDiff1=Integer.parseInt(date1.substring(8,9));
        int dateDiff2=Integer.parseInt(date2.substring(8,9));
        int dateDiff=Math.abs(dateDiff1-dateDiff2);

        return yearDifference+monthDifference+dateDiff;

    }
}
