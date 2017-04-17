/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeinversiones;

/**
 *
 * @author Estudiante
 */
public class DividentStock extends Stock {

    private double dividends;

    public DividentStock(double dividends, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividends = dividends;
    }

  

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }

    public double getMarketValue() {
        return (this.totalShares * this.currentPrice) + this.dividends;
    }
}
