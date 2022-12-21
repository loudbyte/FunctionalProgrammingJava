package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Video2 {

  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

    // procedural (imperative) style:
    List<Integer> evens = new ArrayList<>();
    for (int i = 0; i < integers.size(); i++) {
      boolean isEven = integers.get(i) % 2 == 0;
      if (isEven) {
        evens.add(integers.get(i));
      }
    }

    // functional (declarative) style:
    Predicate<Integer> isEven = x -> x % 2 == 0;

    List<Integer> evensD = integers.stream()
        .filter(isEven)
//        .filter(x -> x % 2 == 0) // we can define the same predicate as anonymous lambda
        .collect(Collectors.toList());

    System.out.println(evensD);

  }

}
