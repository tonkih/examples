package ru.ait.example.task;

import ru.ait.example.operation.SpendOperation;

public class SpendOperationTask implements Runnable {

  private static final int sum = 10;
  private final SpendOperation spendOperation;

  public SpendOperationTask(SpendOperation spendOperation) {
    this.spendOperation = spendOperation;
  }

  @Override
  public void run() {
    var res = spendOperation.spend(sum);
    System.out.println("spend " + res);
  }
}
