package ru.ait.example.client.impl.v1;

import ru.ait.example.client.RestClient;

public class RestClientV1 implements RestClient {
  @Override
  public void send() {
    System.out.println("Send http message v1");
  }
}
