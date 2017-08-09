package com.mycompony.test;

public class Calculator{

  public static void main (String[] args){
    int a =4;
    int b =2;

    System.out.println("Yolo");
    System.out.println(sum(a,b));
  }

  private static int sum( int a, int b){
    return a+b;
  }

  private static int multi( int a, int b){
    return a*b;
  }


  private static int minus( int a, int b){
    return a-b;
  }

  private static int minus(int a, int b, Object GPU){

    int result = 0;

    if (GPU!=NULL)
      result = a-b;

    return result;
  }



}
