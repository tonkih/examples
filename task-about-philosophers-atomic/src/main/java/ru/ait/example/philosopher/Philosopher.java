package ru.ait.example.philosopher;

import static java.lang.Thread.sleep;

import java.util.Random;

import ru.ait.example.fork.Fork;

public class Philosopher implements Runnable {

  private final Random random = new Random();
  private final int number;
  private final Fork leftFork;
  private final Fork rightFork;

  public Philosopher(int number, Fork leftFork, Fork rightFork) {
    this.number = number;
    this.leftFork = leftFork;
    this.rightFork = rightFork;
  }

  @Override
  public void run() {
    while (true) {
      try {
        think();

        label1:
        {
          sleep(1000);
          if (!leftFork.take()) {
            break label1;
          }

          if (!rightFork.take()) {
            leftFork.put();
            System.out.printf(
                "Philosopher %s put fork %s because fork %s not free %n",
                number, leftFork.getNumber(), rightFork.getNumber());
            break label1;
          }
        }

        eat();

        leftFork.put();
        System.out.printf("Philosopher %s put fork %s %n", number, leftFork.getNumber());

        rightFork.put();
        System.out.printf("Philosopher %s put forks %s %n", number, rightFork.getNumber());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void think() throws InterruptedException {
    System.out.printf("Philosopher %s thinking%n", number);
    sleep(getRandom());
    System.out.printf("Philosopher %s finished thinking%n", number);
  }

  public void eat() throws InterruptedException {
    System.out.printf(
        "Philosopher %s took forks %s, %s and eating%n",
        number, leftFork.getNumber(), rightFork.getNumber());
    sleep(getRandom());
    System.out.printf("Philosopher %s finished eating%n", number);
  }

  private int getRandom() {
    return random.ints(1, 10).findFirst().getAsInt();
  }
}
