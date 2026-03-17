package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService
public interface WineStockService {
    String getMenu();
    String placeOrder(String name, int quantity);
}
