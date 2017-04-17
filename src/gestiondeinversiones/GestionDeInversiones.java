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
public class GestionDeInversiones {

    public static void main(String[] args) {
        Banco colpatria = new Banco();
        Cliente c1 = new Cliente("Lizeth", "Gonzalez", 3115452, 17, "liz@hot.com");
        Cliente c2 = new Cliente("Natalia", "Pabon", 3027185, 17, "npabon@hot.com");
        Asset activo1 = new Cash(100);
        Asset activo2 = new Stock(2,"Google", 100, 80);
        c1.addAssets(activo1);
        c1.addAssets(activo2);
        colpatria.addClientes(c1);
        
        Asset activo3 = new MutualFund(2,"Samsung",20,50);
        c2.addAssets(activo3);
        colpatria.addClientes(c2);
        double totalMercado = colpatria.getAllMarketValue();
        System.out.println("Total"+ totalMercado);

    }

}
