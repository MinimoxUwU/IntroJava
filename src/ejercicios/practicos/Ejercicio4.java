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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en Celsius");
        float temp=leer.nextFloat();
        float far=32 + (9 * temp / 5);
        System.out.println("La temperatura en Fahrenheit es : " + far);
    }
}
