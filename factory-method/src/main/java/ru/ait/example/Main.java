package ru.ait.example;

import ru.ait.example.exception.UnsupportedOsException;
import ru.ait.example.loader.LinuxWrapperCreator;
import ru.ait.example.loader.MacosWrapperCreator;
import ru.ait.example.loader.WindowsWrapperCreator;

public class Main {

  public static void main(String[] args) {
    var wrapper = configureCreator();
    wrapper.create();
  }

  private static LibraryWrapperCreator configureCreator() {
    var osName = System.getProperty("os.name");
    if (osName.equals("Windows 10")) {
      return new WindowsWrapperCreator();
    }

    if (osName.equals("Linux")) {
      return new LinuxWrapperCreator();
    }

    if (osName.equals("MacOs")) {
      return new MacosWrapperCreator();
    }

    throw new UnsupportedOsException(osName);
  }
}
