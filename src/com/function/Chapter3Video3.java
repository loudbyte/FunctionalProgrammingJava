package com.function;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Chapter3Video3 {

  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

//    BinaryOperator<Integer> integerBinaryOperator = (accumulator, nextElement) -> accumulator + nextElement;
    BinaryOperator<Integer> integerBinaryOperator = (accumulator, nextElement) -> {
      Integer result = accumulator + nextElement;
      System.out.println("acc: " + accumulator + ", nextElement: " + nextElement + ", result: " + result);
      return result;
    };
    var reduce = integers
        .stream()
        .reduce(0, integerBinaryOperator);

    System.out.println(reduce);

    integers = List.of();

    Integer reduce1 = integers
        .stream()
        .reduce(0, integerBinaryOperator);

    System.out.println(reduce1);

  }

}
