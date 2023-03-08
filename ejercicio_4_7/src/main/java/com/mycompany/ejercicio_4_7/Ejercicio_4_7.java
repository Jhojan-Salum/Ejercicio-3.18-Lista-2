
package com.mycompany.ejercicio_4_7;

import java.util.Scanner;
public class Ejercicio_4_7 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " es igual a " + b);
        }
    }
}

