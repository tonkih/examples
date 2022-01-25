package ru.ait.example.task;

import ru.ait.example.operation.CashOperation;

public class CashOperationTask implements Runnable {

  private final CashOperation cashOperation;

  public CashOperationTask(CashOperation cashOperation) {
    this.cashOperation = cashOperation;
  }

  @Override
  public void run() {
    var cash = cashOperation.getCash();
    System.out.println("cash " + cash);
  }
}
