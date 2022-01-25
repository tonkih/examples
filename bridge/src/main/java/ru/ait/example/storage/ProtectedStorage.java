package ru.ait.example.storage;

public interface ProtectedStorage {
  void saveFile(String path);

  byte[] loadFile(String path);
}
