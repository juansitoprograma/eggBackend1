/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author aeroc
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("La frase ingresa en minusculas es: " + frase.toLowerCase());
        System.out.println("La frase ingresada en mayusculas es: " + frase.toUpperCase());
    }
    
}
/*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/