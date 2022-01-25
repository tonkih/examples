package ru.ait.example.task;

import ru.ait.example.operation.TopUpOperation;

public class TopUpOperationTask implements Runnable {

  private static final int sum = 20;
  private final TopUpOperation topUpOperation;

  public TopUpOperationTask(TopUpOperation topUpOperation) {
    this.topUpOperation = topUpOperation;
  }

  @Override
  public void run() {
    var res = topUpOperation.topUp(sum);
    System.out.println("topUp " + res);
  }
}
