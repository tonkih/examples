package ru.ait.example.factory;

import ru.ait.example.ClientFactory;
import ru.ait.example.client.RestClient;
import ru.ait.example.client.SoapClient;
import ru.ait.example.client.impl.v1.RestClientV1;
import ru.ait.example.client.impl.v1.SoapClientV1;

public class ClientFactoryV1 implements ClientFactory {
  @Override
  public RestClient createHttpClient() {
    return new RestClientV1();
  }

  @Override
  public SoapClient createSoapClient() {
    return new SoapClientV1();
  }
}
