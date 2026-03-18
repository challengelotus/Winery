package br.com.fiap.winery;


import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Menu de Vinhos:\n" +
                "- Cabernet Sauvignon: Vinho Tinto Seco\n" +
                "- Chardonnay: Vinho Branco Seco\n" +
                "- Merlot: Vinho Tinto Suave\n" +
                "- Pinot Noir: Vinho Tinto Leve";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
