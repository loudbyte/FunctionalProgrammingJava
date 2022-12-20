package com.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter2Video8 {

  public static void main(String[] args) {
    // every peace of code should be responsible for only one thing
    // but here divide function is cluttered up by checking argument
    BiFunction<Float, Float, Float> divide1 = (x, y) -> {
      if (y == 0) {
        System.out.println("cannot divide by 0");
        return 0f;
      }
      return x / y;
    };

    // REFACTORED:

    // clean dividing function:
    BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

    // wrapper that checks second argument
    Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
        (func) -> (x, y) -> {
          if (y == 0f) {
            System.out.println("error: secon arg is 0");
            return 0f;
          }
          return func.apply(x, y);
        };

    // our combined function (Higher-ordered function)
    BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide);

    System.out.println(divideSafe.apply(10f, 0f));


  }

}
