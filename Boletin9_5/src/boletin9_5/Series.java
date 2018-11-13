/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Series {

    public void suma() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Elige cuantos números quieren que salga en esta serie:"));
        int cont = 2;
        for (int i = 0; i < num; i++) {
            System.out.println("+" + cont);
            cont = cont + 2;
        }
    }

    public void resta() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Elige cuantos números quieren que salga en esta serie:"));
        int cont = 1;
        for (int i = 0; i < num; i++) {
            if (cont % 2 == 0) {
                System.out.println("+" + cont);
            } else {
                System.out.println("-" + cont);
            }
            cont++;
        }
    }

    public void serie() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Elige cuantos números quieren que salga en esta serie:"));
        int i;
        int cont1 = 0;
        int cont2 = 1;
        int cont3 = cont1 + cont2;
        for (i = 0; i < num; i++) {
            switch (i) {
                case 0:
                    System.out.print(0 + ", ");
                    break;
                case 1:
                    System.out.print(1 + ", ");
                    break;
                default:
                    System.out.print(cont3 + ", ");
                    cont1 = cont2;
                    cont2 = cont3;
                    cont3 = cont1 + cont2;
                    break;
            }
        }
    }
}

