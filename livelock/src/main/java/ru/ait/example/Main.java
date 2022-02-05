package ru.ait.example;

import ru.ait.example.people.People;

public class Main {
  public static void main(String[] args) {
    var people1 = new People(1);
    var people2 = new People(2);

    new Thread(() -> people1.passDoor(people2)).start();
    new Thread(() -> people2.passDoor(people1)).start();
  }
}
