/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author aeroc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa tu nombre:");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);    
    }
    
}
/*2.Escribir un programa que pida tu nombre, lo guarde en una variable
y lo muestre por pantalla*/