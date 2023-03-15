/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.pkg14;

/**
 *
 * @author Jhojan
 */
import  java.util.Scanner;
public class Ejercicio414 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*a cada departamento se le pide el importe global de las ventas. A los departamentos que excedan el 33%
        de las ventas totales se les adiciona al salario de los vendedores un porcentaje equivalente al 20% del
        salario mensual. */

        //Declaracion de variables
        double ventasTotales, salarioVendedor;
        double[] salarios = new double[3];
        double[] ventas = new double[3];
        Scanner sc = new Scanner(System.in);
        //Ingreso de datos
        System.out.println("Ingrese el salario de los vendedores: ");
        salarioVendedor = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 1: ");
        ventas[0] = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        ventas[1] = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        ventas[2] = sc.nextDouble();
        //Proceso
        ventasTotales = ventas[0] + ventas[1] + ventas[2];
        for (int i = 0; i < 3; i++) {
            if (ventas[i] > (ventasTotales * 0.33)) {
                salarios[i] = salarioVendedor + (salarioVendedor * 0.20);
            } else {
                salarios[i] = salarioVendedor;
            }
        }
        //Salida
        for (int i = 0; i < 3; i++) {
            System.out.println("El salario del departamento " + (i + 1) + " es: " + salarios[i]);
        }
        

    }
    
}
