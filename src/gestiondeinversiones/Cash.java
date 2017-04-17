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
public class Cash implements Asset {

    public Cash(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    protected double amount;

    @Override
    public double getMarketvalue() {
        return this.amount;
    }

    @Override
    public double getProfit() {
        return 0;
    }

}
