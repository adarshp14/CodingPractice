package com.interview.coding.dataStruture.dynamicProg;

public class fibonacci {
  public static void main(String[] args) {

    System.out.println(fibo(10));
  }
  public static int fibo(int n)
  {
      int [] data=new int[n];
      if(n==0 || n==1)
      {
          return n;
      }
      if(data[n]!=0)
      {
          return  data[n];
      }
      int fib1=fibo(n-1);
      int fib2=fibo(n-2);
      data[n]=fib1+fib2;
      return fib1+fib2;
  }
}
