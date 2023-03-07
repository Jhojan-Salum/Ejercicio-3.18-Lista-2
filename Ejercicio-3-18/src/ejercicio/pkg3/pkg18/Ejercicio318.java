/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.pkg18;
import java.util.Scanner;

/**
 *
 * @author jteheranm
 */
public class Ejercicio318 {

    public static void main(String[] args) {
        /* Se tiene la siguiente información de un empleado: 
            · código del empleado, 
            · nombres, 
            · número de horas trabajadas al mes, 
            · valor hora trabajada, 
            · porcentaje de retención en la fuente. 
            Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto. */
        Scanner entrada = new Scanner(System.in);
        int codigo, horas_trabajo;
        double salario_hora;

        /* Peticion de datos al usuario */
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el codigo del empleado:");
        codigo = entrada.nextInt();
        System.out.println("Ingrese las horas de trabajo del empleado:");
        horas_trabajo = entrada.nextInt();
        System.out.println("Ingrese el salario por hora del empleado:");
        salario_hora = entrada.nextDouble();

        /* Creacion del objeto empleado */
        empleado empleado = new empleado(codigo, nombre, horas_trabajo, salario_hora);

        /* Calculo de salario bruto y neto */
        empleado.calcular_salario();

        /* Mostrar datos */
        empleado.mostrar_datos();


    }

}
