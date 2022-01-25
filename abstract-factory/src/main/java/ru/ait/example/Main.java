package ru.ait.example;

import ru.ait.example.factory.ClientFactoryV1;

public class Main {

  public static void main(String[] args) {
      var clientFactory = new ClientFactoryV1();
      var client = clientFactory.createSoapClient();
      client.send();
  }
}
