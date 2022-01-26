package ru.ait.example.fork;

public class Fork {

  private final Object object = new Object();
  private boolean free = true;
  private final int number;

  public Fork(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public boolean take() throws InterruptedException {
    synchronized (object) {
      if (!free) {
        object.wait();
      }
      free = false;
      System.out.printf("Fork %s taking%n", number);
      return true;
    }
  }

  public void put() {
    synchronized (object) {
      free = true;
      object.notifyAll();
    }
  }
}
