package ru.ait.example.client.impl.v2;

import ru.ait.example.client.RestClient;

public class RestClientV2 implements RestClient {
  @Override
  public void send() {
    System.out.println("Rend message rest client v2");
  }
}
