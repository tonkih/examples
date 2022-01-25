package ru.ait.example.storage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import ru.ait.example.cipher.Cipher;
import ru.ait.example.file.AbsFile;

public class WindowsProtectedStorage implements ProtectedStorage {

  private final Map<String, AbsFile> files = new HashMap<>();

  private final Cipher cipher;

  public WindowsProtectedStorage(Cipher cipher) {
    this.cipher = cipher;
  }

  @Override
  public void saveFile(String path) {
    var file = loadAbsFile(path);
    var encodedContent = cipher.encodeFile(file);
    files.put(path, new AbsFile(encodedContent));
  }

  @Override
  public byte[] loadFile(String path) {
    var file = files.get(path);
    return cipher.decodeFile(file);
  }

  private AbsFile loadAbsFile(String path) {
    return new AbsFile(new byte[0]);
  }
}
