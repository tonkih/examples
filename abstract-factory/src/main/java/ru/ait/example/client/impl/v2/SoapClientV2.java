package ru.ait.example.client.impl.v2;

import ru.ait.example.client.SoapClient;

public class SoapClientV2 implements SoapClient {
  @Override
  public void send() {
    System.out.println("Send message soap client v2");
  }
}
