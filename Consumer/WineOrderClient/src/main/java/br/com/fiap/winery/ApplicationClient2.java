package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "http://localhost:8085/WineStockService?wsdl";
        final String TARGET = "http://winery.fiap.com.br/";
        final String NAME = "WineStockServiceImplementationService";

        URL url = new URL(WSDL);
        QName qName = new QName(TARGET, NAME);

        Service service = Service.create(url, qName);
    }
}
