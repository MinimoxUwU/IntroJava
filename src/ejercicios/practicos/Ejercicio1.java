/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author Juanfra
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=leer.nextInt();
        int num1=leer.nextInt();
        int suma=num+num1;
        System.out.println("La suma entre ambos numeros es :" + suma);
    }
    
}
