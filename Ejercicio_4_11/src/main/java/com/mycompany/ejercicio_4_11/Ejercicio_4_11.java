

package com.mycompany.ejercicio_4_11;

import java.util.Scanner;
public class Ejercicio_4_11 {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int a = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int b = input.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int c = input.nextInt();
        
        int mayor = a;
        
        if (b > mayor) {
            mayor = b;
        }
        
        if (c > mayor) {
            mayor = c;
        }
        
        System.out.println("El número mayor es: " + mayor);
    }
}
