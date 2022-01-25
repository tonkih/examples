package ru.ait.example.loader;

import ru.ait.example.wrapper.MacosWrapper;
import ru.ait.example.wrapper.Wrapper;

public class MacosWrapperCreator extends LinuxWrapperCreator {
  public Wrapper createWrapper() {
    return new MacosWrapper();
  }
}
