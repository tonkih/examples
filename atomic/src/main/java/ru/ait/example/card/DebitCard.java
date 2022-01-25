package ru.ait.example.card;

import java.util.concurrent.atomic.AtomicInteger;

public class DebitCard implements Card {

  private final AtomicInteger cash;

  public DebitCard(int initialValue) {
    cash = new AtomicInteger(initialValue);
  }

  @Override
  public int spend(int sum) {
    return cash.addAndGet(-sum);
  }

  @Override
  public int topUp(int sum) {
    return cash.addAndGet(sum);
  }

  @Override
  public int getCash() {
    return cash.get();
  }
}
