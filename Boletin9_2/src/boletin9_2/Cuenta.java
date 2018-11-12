/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author ecollazodominguez
 */
public class Cuenta {
    public void sumaProducto(){
        double cont;
        double sumaN = 10;
        double productoN = 10;
        
        for(cont = 11;cont < 90;cont++){
            sumaN = sumaN + cont;
            productoN = productoN * cont;
        }
        System.out.println("Suma total: "+sumaN+"\nProducto total: "+productoN);
    }
}
