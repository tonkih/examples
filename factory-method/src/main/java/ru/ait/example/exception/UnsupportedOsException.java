package ru.ait.example.exception;

public class UnsupportedOsException extends RuntimeException {
  public UnsupportedOsException(String osName) {
    super(String.format("OS %s not supported", osName));
  }
}
