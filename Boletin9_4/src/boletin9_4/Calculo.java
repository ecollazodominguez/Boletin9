/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Calculo {
    private static int nmulti = 1;
    private int numero;
    
    public void tablaMultiplicar(){
        do{
        Scanner ler = new Scanner(System.in);
        System.out.println("Inserte número:");
        this.numero = ler.nextInt();
        
        JOptionPane.showMessageDialog(null, numero+"x"+nmulti+" = "+numero * nmulti+++"\b\b\b\b"+numero+"x"+ nmulti +" = "+numero * nmulti++
                                        +"\n"+numero+"x"+nmulti+" = "+numero * nmulti+++"\b\b\b\b"+numero+"x"+nmulti+" = "+numero * nmulti++
                                        +"\n"+numero+"x"+nmulti+" = "+numero * nmulti+++"\b\b\b\b"+numero+"x"+nmulti+" = "+numero * nmulti++
                                        +"\n"+numero+"x"+nmulti+" = "+numero * nmulti+++"\b\b\b\b"+numero+"x"+nmulti+" = "+numero * nmulti++
                                        +"\n"+numero+"x"+nmulti+" = "+numero * nmulti+++"\b\b\b\b"+numero+"x"+nmulti+" = "+numero * nmulti++);
        nmulti = 1;
        }while(numero>0);
     
    }
}
