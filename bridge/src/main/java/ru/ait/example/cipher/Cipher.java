package ru.ait.example.cipher;

import ru.ait.example.file.AbsFile;

public interface Cipher {

  byte[] encodeFile(AbsFile absFile);

  byte[] decodeFile(AbsFile absFile);
}
