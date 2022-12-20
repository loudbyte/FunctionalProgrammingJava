package com.function;

public class Chapter2Video7 {

  public static void main(String[] args) {
    NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
      String name = "Shaun";
      return () -> "Hello, " + name;
    };

    NoArgFunction<String> greeter = createGreeter.apply();

    // every call of the function has access to variable 'name' even we are already not in scope of a function
    System.out.println(greeter.apply());
  }

}
