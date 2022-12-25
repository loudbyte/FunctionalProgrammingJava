package com.function;

import com.function.Chapter3Challenge1.Employee;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter4Video4Combining {

  public static void main(String[] args) {
    Function<Integer, Integer> timesTwo = x -> x * 2;

    Function<Integer, Integer> minusOne = x -> x - 1;

    Function<Integer, Integer> timesTwoMinusOne1 = minusOne.compose(timesTwo); // runs in reversed order
    Function<Integer, Integer> timesTwoMinusOne2 = timesTwo.andThen(minusOne);

    System.out.println(timesTwoMinusOne1.apply(10));
    System.out.println(timesTwoMinusOne2.apply(10));




    List<Employee> employees = List.of(
        new Employee("John", 34, "developer", 80000f),
        new Employee("Hannah", 24, "developer", 95000f),
        new Employee("Bart", 50, "sales executive", 100000f),
        new Employee("Sophie", 49, "construction worker", 40000f),
        new Employee("Darren", 38, "writer", 50000f),
        new Employee("Nancy", 29, "developer", 75000f)
        );

    Function<Employee, String> getName = e -> e.name;
    Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
    Function<String, String> toUpperCase = String::toUpperCase;

    Function<Employee, String> getReversedUppercasedName =
        getName.andThen(reverse).andThen(toUpperCase);

    List<String> result = employees.stream()
        .map(getReversedUppercasedName)
        .collect(Collectors.toList());

    System.out.println(result);

  }

  static class Employee {
    public final String name;
    public final Integer age;
    public final String jobTitle;
    public final Float salary;

    public Employee(String name, Integer age, String jobTitle, Float salary) {
      this.name = name;
      this.age = age;
      this.jobTitle = jobTitle;
      this.salary = salary;
    }
  }

}
