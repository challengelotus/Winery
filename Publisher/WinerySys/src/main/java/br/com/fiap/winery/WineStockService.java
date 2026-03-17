package br.com.fiap.winery;

public interface WineStockService {
    String getMenu();
    String placeOrder(String name, int quantity);
}
