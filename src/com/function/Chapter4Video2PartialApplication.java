package com.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter4Video2PartialApplication {

  public static void main(String[] args) {
    TriFunction<Integer, Integer, Integer, Integer> add = (x,y,z) -> x+y+z;

    Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial =
        x -> (y, z) -> add.apply(x, y, z);

    BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);

    System.out.println(add5.apply(6,7));


    Function<Integer, Function<Integer, Function<Integer, Integer>>> add_2 =
        x -> y -> z -> add.apply(x, y, z);

    Function<Integer, Function<Integer, Integer>> add5_2 = add_2.apply(5);

    Function<Integer, Integer> add5and6_2 = add5_2.apply(6);

    Integer result = add5and6_2.apply(7);

    System.out.println(result);


  }

}
