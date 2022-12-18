package com.function;

import java.util.function.Function;

public class Chapter2Video1 {

  protected static class MyMath {
    public static Integer triple(Integer x) {
      return x * 3;
    }

  }

  public static void main(String[] args) {
    // Use functions as classes
    // Define function (method) as variable:
    Function<Integer, Integer> myTriple = MyMath::triple;

    Integer result = myTriple.apply(5);
    System.out.println(result);
  }

}
