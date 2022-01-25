package ru.ait.example.loader;

import ru.ait.example.LibraryWrapperCreator;
import ru.ait.example.wrapper.LinuxWrapper;
import ru.ait.example.wrapper.Wrapper;

public class LinuxWrapperCreator extends LibraryWrapperCreator {
  @Override
  public Wrapper createWrapper() {
    return new LinuxWrapper();
  }
}
