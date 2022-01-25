package ru.ait.example;

import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

import java.util.List;

import ru.ait.example.card.DebitCard;
import ru.ait.example.task.CashOperationTask;
import ru.ait.example.task.SpendOperationTask;
import ru.ait.example.task.TopUpOperationTask;

public class Main {

  public static void main(String[] args) {
    var card = new DebitCard(1000);
    var scheduler = newScheduledThreadPool(3);
    List.of(new CashOperationTask(card), new SpendOperationTask(card), new TopUpOperationTask(card))
        .forEach(task -> scheduler.scheduleAtFixedRate(task, 0, 500, MILLISECONDS));
  }
}
