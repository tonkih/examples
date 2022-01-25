package ru.ait.example.file;

public class AbsFile {
  private byte[] content;

  public AbsFile(byte[] content) {
    this.content = content;
  }

  private byte[] getContent() {
    return content;
  }

  private void setContent(byte[] content) {
    this.content = content;
  }
}
