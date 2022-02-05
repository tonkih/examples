package ru.ait.example;

import static java.lang.Thread.sleep;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

import ru.ait.example.shared.Shared;
import ru.ait.example.worker.Worker1;
import ru.ait.example.worker.Worker2;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    var shared = new Shared();

    var worker1 = new Worker1(shared);
    var worker2 = new Worker2(shared);

    var thread1 = new Thread(worker1);
    var thread2 = new Thread(worker2);

    thread1.start();
    thread2.start();

    sleep(5000);

    System.out.println();

    //detectDeadLock();
  }

  private static void detectDeadLock() {
    var threadMXBean = ManagementFactory.getThreadMXBean();
    var threadIds = threadMXBean.findMonitorDeadlockedThreads();

    if (threadIds == null) {
      System.out.println("Deadlocked thread not found");
      return;
    }

    for (ThreadInfo threadInfo : threadMXBean.getThreadInfo(threadIds)) {
      System.out.println("Thread id " + threadInfo.getThreadId());
      System.out.println("Thread name " + threadInfo.getThreadName());
      System.out.println("Lock name " + threadInfo.getLockName());
      System.out.println("Lock owner id " + threadInfo.getLockOwnerId());
      System.out.println("Lock owner name " + threadInfo.getLockOwnerName());
      System.out.println("===========================");
      System.out.println();
    }
  }
}
