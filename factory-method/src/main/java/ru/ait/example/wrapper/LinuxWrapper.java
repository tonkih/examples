package ru.ait.example.wrapper;

public class LinuxWrapper implements Wrapper {
  @Override
  public void wrap() {
    System.out.println("Init linux wrapper");
  }
}
