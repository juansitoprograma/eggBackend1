/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author aeroc
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int entero = leer.nextInt();
        System.out.println("El doble del número ingresado es " + entero*2 + " y el triple es " + entero*3 + ".");
        double raiz = Math.sqrt(entero);
        System.out.println("La raiz del número ingresado es: " + raiz);
    }
    
}
/*5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().*/