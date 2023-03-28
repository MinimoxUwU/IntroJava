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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        System.out.println("Su numero es: " + num);
        System.out.println("El doble es: " + num*2);
        System.out.println("El triple es: " + num*3);
        System.out.println("La raiz cuadrada es : " + Math.sqrt(num));
    }
    
}
