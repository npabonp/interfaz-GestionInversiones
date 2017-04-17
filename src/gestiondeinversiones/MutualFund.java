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
public class MutualFund extends ShareAsset {

    protected double TotalShares;

    public MutualFund(int totalShares,String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.TotalShares = totalShares;
    }

    @Override
    public double getMarketvalue() {
        return this.TotalShares * this.currentPrice;
    }

    @Override
    public double getProfit() {
        return (this.TotalShares * this.currentPrice) - this.totalCost;
    }

}
