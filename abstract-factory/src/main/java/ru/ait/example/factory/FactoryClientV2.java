package ru.ait.example.factory;

import ru.ait.example.ClientFactory;
import ru.ait.example.client.RestClient;
import ru.ait.example.client.SoapClient;
import ru.ait.example.client.impl.v2.RestClientV2;
import ru.ait.example.client.impl.v2.SoapClientV2;

public class FactoryClientV2 implements ClientFactory {
  @Override
  public RestClient createHttpClient() {
    return new RestClientV2();
  }

  @Override
  public SoapClient createSoapClient() {
    return new SoapClientV2();
  }
}
