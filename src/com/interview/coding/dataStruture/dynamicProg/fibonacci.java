package com.interview.coding.dataStruture.dynamicProg;

import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int input=sc.nextInt();
      while(input>0)
      {
          int classes=sc.nextInt();
          int days=1;
          while(classes-days<1)
          {
              classes-=days;

              days++;
          }
          System.out.println(days+1);
          input--;
      }
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
