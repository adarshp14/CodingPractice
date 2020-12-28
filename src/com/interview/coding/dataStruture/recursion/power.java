package com.interview.coding.dataStruture.recursion;

public class power {
  public static void main(String[] args) {
    //
    System.out.println(powerCal(2,2));
  }
  public static int powerCal(int n,int x)
  {
      if(x==0) return 1;

      return powerCal(n,x-1)*n;
  }
}
