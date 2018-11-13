/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Rectángulo {

    private float altura;
    private float base;

    public boolean calcularArea() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Inserte altura:");
        altura = ler.nextFloat();
        System.out.println("Inserte base: ");
        base = ler.nextFloat();

        do {
            if (altura >= 0 && base >= 0) {
                JOptionPane.showMessageDialog(null, "El área es: " + base * altura);
                return true;
            } else if (altura < 0) {
                System.out.println("Inserte altura correcta:");
                altura = ler.nextFloat();
            } else {
                System.out.println("Inserte base correcta: ");
                base = ler.nextFloat();
            }
        } while (base < 0 || altura < 0);
        JOptionPane.showMessageDialog(null, "El área es: " + base * altura);
        return true;
    }
}
