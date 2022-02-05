package ru.ait.example.worker;

import ru.ait.example.shared.Shared;

public class Worker1 implements Runnable {
  private final Shared shared;

  public Worker1(Shared shared) {
    this.shared = shared;
  }

  @Override
  public void run() {
    try {
      System.out.println("Start " + Thread.currentThread().getId() );
      shared.shareObject1();
      System.out.println("Finished " + Thread.currentThread().getId());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
