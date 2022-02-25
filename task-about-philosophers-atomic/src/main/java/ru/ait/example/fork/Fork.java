package ru.ait.example.fork;

import java.util.concurrent.atomic.AtomicBoolean;

public class Fork {

  private final AtomicBoolean free = new AtomicBoolean(true);
  private final int number;

  public Fork(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public boolean take() throws InterruptedException {
    return free.compareAndSet(true, false);
  }

  public void put() {
    free.set(true);
  }
}
