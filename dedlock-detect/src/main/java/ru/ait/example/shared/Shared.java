package ru.ait.example.shared;

import static java.lang.Thread.sleep;

public class Shared {

  private final Object object1 = new Object();
  private final Object object2 = new Object();

  public void shareObject1() throws InterruptedException {
    synchronized (object1) {
      sleep(2_000);
      synchronized (object2) {
        sleep(2_000);
      }
    }
  }

  public void shareObject2() throws InterruptedException {
    synchronized (object2) {
      sleep(2_000);
      synchronized (object1) {
        sleep(2_000);
      }
    }
  }
}
