package com.function;

import java.util.function.Function;

public class Chapter2Video6 {

  protected static class MyMath {
    public static Integer timesTwo(Integer x) {
      return x * 2;
    }
    public static Integer timesThree(Integer x) {
      return x * 3;
    }
    public static Integer timesFour(Integer x) {
      return x * 4;
    }

    public static Function<Integer, Integer> createMultiplier(Integer y) {
      return (Integer x) -> x * y;
    }
  }

  public static void main(String[] args) {
//    NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
//      return () -> "Hello function!";
//    };
    // just the same as above with curly parentheses:
    NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Hello function!"; // () -> () -> function returns function

    NoArgFunction<String> greeter = createGreeter.apply();

    System.out.println(greeter.apply());
    System.out.println("-------------");

    Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
    Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
    Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);

    System.out.println(timesTwo.apply(3));
    System.out.println(timesThree.apply(3));
    System.out.println(timesFour.apply(3));
  }

}
