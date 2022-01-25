package ru.ait.example.fork;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {

  private final ReentrantLock lock = new ReentrantLock();
  private final Condition condition = lock.newCondition();
  private boolean free = true;
  private final int number;

  public Fork(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public boolean take() throws InterruptedException {
    lock.lock();
    if (!free) {
      condition.await();
    }
    free = false;
    System.out.printf("Fork %s taking%n", number);
    lock.unlock();
    return true;
  }

  public void put() {
    lock.lock();
    free = true;
    condition.signalAll();
    lock.unlock();
  }
}
