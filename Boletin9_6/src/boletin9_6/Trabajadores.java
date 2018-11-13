/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Trabajadores {

    public void Soldo() {
        float soldo;
        int trabajadoresT = 0;
        int trabajadoresA = 0;
        int trabajadoresB = 0;
        do {
            soldo = Float.parseFloat(JOptionPane.showInputDialog("Cantidad de soldo do empleado:"));
            if (soldo > 0) {
                trabajadoresT++;
            }
            if (soldo >= 1000 && soldo <= 1750) {
                trabajadoresA++;
            } else if (soldo < 1000 && soldo > 0) {
                trabajadoresB++;
            }
        } while (soldo != 0);
        JOptionPane.showMessageDialog(null, "Entre 1750€ e 1000€ hai: " + trabajadoresA + " trabajadores.\nE a porcentaxe dos traballadores que gañan menos de 100€ é: " + trabajadoresB * 100 / trabajadoresT + "%");
    }

}
