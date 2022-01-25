package ru.ait.example.cipher;

import ru.ait.example.file.AbsFile;

public class AesCipher implements Cipher {
  @Override
  public byte[] encodeFile(AbsFile absFile) {
    System.out.println("aes cipher encrypted file");
    return new byte[0];
  }

  @Override
  public byte[] decodeFile(AbsFile absFile) {
    System.out.println("aes cipher decode file file");
    return new byte[0];
  }
}
