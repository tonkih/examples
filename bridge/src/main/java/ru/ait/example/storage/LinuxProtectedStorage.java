package ru.ait.example.storage;

import java.util.HashMap;
import java.util.Map;

import ru.ait.example.cipher.Cipher;
import ru.ait.example.file.AbsFile;

public class LinuxProtectedStorage implements ProtectedStorage {

  private final Cipher cipher;

  private final Map<String, byte[]> files = new HashMap<>();

  public LinuxProtectedStorage(Cipher cipher) {
    this.cipher = cipher;
  }

  @Override
  public void saveFile(String path) {
    var file = loadAbsFile(path);
    var encodedContent = cipher.encodeFile(file);
    files.put(path, encodedContent);
  }

  @Override
  public byte[] loadFile(String path) {
    var encodedContent = files.get(path);
    return cipher.decodeFile(new AbsFile(new byte[0]));
  }

  private AbsFile loadAbsFile(String filePath) {
    return new AbsFile(new byte[0]);
  }
}
