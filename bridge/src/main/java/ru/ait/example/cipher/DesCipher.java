package ru.ait.example.cipher;

import ru.ait.example.file.AbsFile;

public class DesCipher implements Cipher {
  @Override
  public byte[] encodeFile(AbsFile absFile) {
    System.out.println("Des cipher encode file");
    return new byte[0];
  }

  @Override
  public byte[] decodeFile(AbsFile absFile) {
    System.out.println("Des cipher decode file file");
    return new byte[0];
  }
}
