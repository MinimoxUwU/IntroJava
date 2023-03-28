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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String frase=leer.nextLine();
        String mayus=frase.toUpperCase();
        String minus=frase.toLowerCase();
        System.out.println("La frase o palabra en mayusculas es : " + mayus);
        System.out.println("La frase o palabra en minusculas es : " + minus);
    }
}
