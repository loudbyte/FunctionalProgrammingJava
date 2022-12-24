package com.function;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter3Video4 {

  public static void main(String[] args) {

    List<String> strings = List.of("asd", "a d", "asdasd", "asdadasd", "asdasdasdasd");

    String joined = strings.stream()
        .collect(Collectors.joining(", "));

    System.out.println(joined);

    Map<Integer, List<String>> grouping = strings.stream()
        .collect(Collectors.groupingBy(String::length));

    System.out.println(grouping);

    Map<Boolean, List<String>> partitioning = strings.stream()
        .collect(Collectors.partitioningBy(string -> string.length() > 7));

    System.out.println(partitioning);
  }
}
