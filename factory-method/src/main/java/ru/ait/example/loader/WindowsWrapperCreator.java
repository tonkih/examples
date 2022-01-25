package ru.ait.example.loader;

import ru.ait.example.LibraryWrapperCreator;
import ru.ait.example.wrapper.WindowsWrapper;
import ru.ait.example.wrapper.Wrapper;

public class WindowsWrapperCreator extends LibraryWrapperCreator {
  @Override
  public Wrapper createWrapper() {
    return new WindowsWrapper();
  }
}
