package ru.ait.example;

import static java.util.concurrent.Executors.newFixedThreadPool;

import ru.ait.example.fork.Fork;
import ru.ait.example.philosopher.Philosopher;

public class Main {

  public static void main(String[] args) {
    var forks = new Fork[5];
    for (int i = 0; i < forks.length; i++) {
      forks[i] = new Fork(i);
    }

    var executor = newFixedThreadPool(5);

    var philosophers = new Philosopher[5];
    for (int i = 0; i < philosophers.length; i++) {
      var forkNumber = i == forks.length - 1 ? 0 : i + 1;
      philosophers[i] = new Philosopher(i, forks[i], forks[forkNumber]);
      new Thread(philosophers[i]).start();
    }
  }
}
