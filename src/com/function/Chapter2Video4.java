package com.function;

public class Chapter2Video4 {

  protected static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  protected static class DataLoader {
    public final NoArgFunction<Person> loadPerson;

    public DataLoader(boolean isDevelopment) {
      this.loadPerson = isDevelopment
          ? this::loadPersonFake
          : this::loadPersonReal;
    }

    private Person loadPersonReal() {
      System.out.println("Loading Person...");
      return new Person("Real person", 30);
    }
    private Person loadPersonFake() {
      System.out.println("Loading Fake Person...");
      return new Person("Fake person", 100);
    }
  }

  public static void main(String[] args) {
    final boolean isDevelopment = false; // change it to false/true to change load person fake/real

    DataLoader dataLoader = new DataLoader(isDevelopment);

    System.out.println(dataLoader.loadPerson.apply());
  }

}
