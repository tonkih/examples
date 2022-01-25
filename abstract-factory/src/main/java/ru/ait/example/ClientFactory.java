package ru.ait.example;

import ru.ait.example.client.RestClient;
import ru.ait.example.client.SoapClient;

public interface ClientFactory {
  RestClient createHttpClient();

  SoapClient createSoapClient();
}
