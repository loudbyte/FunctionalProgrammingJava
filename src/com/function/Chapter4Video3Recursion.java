package com.function;

public class Chapter4Video3Recursion {

  public static void countDown(Integer x) {
    if (x < 0) {
      System.out.println("done!");
      return;
    }
    System.out.println(x);
    countDown(x - 1);
  }

  public static void countUp(Integer x, Integer end) {
    if (x > end) {
      System.out.println("done!");
      return;
    }
    System.out.println(x);
    countUp(x + 1, end);
  }

  public static void main(String[] args) {

    countUp(0, 10);

  }

}
