package com.function;

import java.util.List;
import java.util.stream.Collectors;

public class Chapter3Video8ParallelStreams {

  public static void main(String[] args) {
    List<String> strings = List.of("hello", "apple", "functional", "programming", "is", "cool");

    List<String> strings2 = strings
//        .stream()
        .parallelStream()
        .map(string -> {
          System.out.println("Uppercasing word: " + string);
          return string.toUpperCase();
        })
        .map(string -> {
          System.out.println("Adding exclamation point to: " + string);
          return string + "!";
        })
        .collect(Collectors.toList());

    System.out.println(strings2);

  }


}
