/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeinversiones;

import java.util.HashMap;

public class Banco {

    /**
     * el banco tiene clientes y los clientes tienen activos la responsabilidad
     * del bancvo es crear sus clientes
     *
     */
    private HashMap<String, Cliente> clientes;

    public Banco() {
        this.clientes = new HashMap<>();
    }

    public void addClientes(Cliente cliente) {
        this.clientes.put(cliente.getEmail(), cliente);
    }

    public double getAllMarketValue() {
        double total = 0;
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAssets()) {
                total += asset.getMarketvalue();
            }
        }
        return total;
    }

    public double getAllProfit() {
        double total = 0;
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAssets()) {
                total += asset.getMarketvalue();
            }
        }
        return total;
    }

    public HashMap getAllByTypeAsset() {
        HashMap<String, Double> total = new HashMap();
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAssets()) {
                if (asset instanceof Cash) {
                    if (total.containsKey("cash")) {
                        Double valor = total.get("cash");
                    } else {
                        Double valorActual = total.get("cash");
                        Double nuevoValor = valorActual + asset.getMarketvalue();
                        total.put("cash", nuevoValor);
                    }

                } else if (asset instanceof MutualFund) { //instance of es para saber si el hijo es de ese tipo
                    if (total.containsKey("cash")) {
                        Double valor = total.get("cash");
                    } else {
                        Double valorActual = total.get("cash");
                        Double nuevoValor = valorActual + asset.getMarketvalue();
                        total.put("cash", nuevoValor);
                    }
                } else if (asset instanceof DividentStock) {
                    if (total.containsKey("cash")) {
                        Double valor = total.get("cash");
                    } else {
                        Double valorActual = total.get("cash");
                        Double nuevoValor = valorActual + asset.getMarketvalue();
                        total.put("cash", nuevoValor);
                    }
                } else if (asset instanceof Stock) {
                    if (total.containsKey("cash")) {
                        Double valor = total.get("cash");
                    } else {
                        Double valorActual = total.get("cash");
                        Double nuevoValor = valorActual + asset.getMarketvalue();
                        total.put("cash", nuevoValor);
                    }
                }
            }
        }
        return total;
    }

    public Cliente getMaxProfit() {
        for (Cliente cliente : this.clientes.values()) {
            for (int i = 0; i < cliente.getAssets().size(); i++) {
                while()
            }
        }
    return null;}

}
