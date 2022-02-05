package ru.ait.example.people;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class People {

  private boolean passedDoor = true;
  private int number;

  public People(int number) {
    this.number = number;
  }

  public void passDoor(People people) {
    while (people.hasPassedDoor()) {
      System.out.println(format("People %s waiting to pass the door", number));

      try {
        sleep(1000);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }

    System.out.println(format("People %s passed door", number));
    passedDoor = false;
  }

  public boolean hasPassedDoor() {
    return passedDoor;
  }
}
