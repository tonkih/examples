package ru.ait.example;

import ru.ait.example.wrapper.Wrapper;

public abstract class LibraryWrapperCreator {

  public void create() {
    var wrapper = createWrapper();
    wrapper.wrap();
  }

  public abstract Wrapper createWrapper();
}
