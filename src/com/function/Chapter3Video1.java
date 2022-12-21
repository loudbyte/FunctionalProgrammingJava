package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter3Video1 {

  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

    // this approach works and it is ok to use it
    // but there are problems with readability, maintainability and conceptual purity
    // we want just double all elements of the list, but we are forced to worry about indexing, lists lengths etc
    // we should be able to program in a way that allows us to simply specify what it is we want
    // instead of specifying each individual step to compute the result as we doing here
    List<Integer> doubled = new ArrayList<>();
    for (int i = 0; i < integers.size(); i++) {
      var result = integers.get(i) * 2;
      doubled.add(result);
    }

    // functional programming allows us to program in a way that allows us to simply specify what it is we want
    Function<Integer, Integer> timesTwo = x -> x * 2;
    doubled = integers.stream()
        .map(timesTwo)
        .collect(Collectors.toList());
    // so we defined just HOW we want to transform each element in our array and express that in a function
    // and map() will worry about indexing etc, not us

    System.out.println(doubled);
  }

}
