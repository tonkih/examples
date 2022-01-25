package ru.ait.example;

import ru.ait.example.cipher.AesCipher;
import ru.ait.example.storage.LinuxProtectedStorage;

public class Main {
  public static void main(String[] args) {
    var file = "C:/file/text.txt";

    var cipher = new AesCipher();

    var storage = new LinuxProtectedStorage(cipher);
    storage.saveFile(file);
    var content = storage.loadFile(file);
  }
}
