/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Numeros {

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;
    private int num8;
    private int num9;
    private int num10;

    public void pedirNumero() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Número: ");
        num1 = ler.nextInt();
        System.out.println("Número: ");
        num2 = ler.nextInt();
        System.out.println("Número: ");
        num3 = ler.nextInt();
        System.out.println("Número: ");
        num4 = ler.nextInt();
        System.out.println("Número: ");
        num5 = ler.nextInt();
        System.out.println("Número: ");
        num6 = ler.nextInt();
        System.out.println("Número: ");
        num7 = ler.nextInt();
        System.out.println("Número: ");
        num8 = ler.nextInt();
        System.out.println("Número: ");
        num9 = ler.nextInt();
        System.out.println("Número: ");
        num10 = ler.nextInt();

    }

//    public void contarNumero() {
//        int count = 0;
//        int positivo = 0;
//        int negativo = 0;
//        int cero = 0;
//
//        do {
//            if (num1 > 0) {
//                positivo++;
//            } else if (num1 < 0) {
//                negativo++;
//            } else {
//                cero++;
//            }
//
//        count++;
//        num1 = num2;
//        num2 = num3;
//        num3 = num4;
//        num4 = num5;
//        num5 = num6;
//        num6 = num7;
//        num7 = num8;
//        num8 = num9;
//        num9 = num10;
//                
//        } while (count < 10);
//        System.out.println("Positivos: "+positivo+"\nNegativos: "+negativo+"\nCeros: "+cero);
//    }
    public void contarNumero() {
        int count = 0;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        for (count = 0; count < 10; count++){
            if (num1 > 0) {
                positivo++;
            } else if (num1 < 0) {
                negativo++;
            } else {
                cero++;
            }

        num1 = num2;
        num2 = num3;
        num3 = num4;
        num4 = num5;
        num5 = num6;
        num6 = num7;
        num7 = num8;
        num8 = num9;
        num9 = num10;
        }
          
        System.out.println("Positivos: "+positivo+"\nNegativos: "+negativo+"\nCeros: "+cero);
    }
    
}
