package ru.ait.example.client.impl.v1;

import ru.ait.example.client.SoapClient;

public class SoapClientV1 implements SoapClient {
  @Override
  public void send() {
    System.out.println("Send soap message v1");
  }
}
