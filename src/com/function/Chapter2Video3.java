package com.function;

import java.util.function.BiFunction;

public class Chapter2Video3 {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
    System.out.println(add.apply(5,7));

    TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
    System.out.println(addThree.apply(1, 4, 10));

    NoArgFunction<String> sayHello = () -> "Hello";
    System.out.println(sayHello.apply());
  }

}
