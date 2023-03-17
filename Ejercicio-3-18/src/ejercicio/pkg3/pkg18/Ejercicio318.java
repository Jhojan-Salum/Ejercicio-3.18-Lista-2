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
        byte opcion;

        /* Peticion de datos al usuario */
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el codigo del empleado:");
        codigo = entrada.nextInt();
        System.out.println("Ingrese las horas de trabajo del empleado:");
        horas_trabajo = entrada.nextInt();
        System.out.println("Ingrese el salario por hora del empleado:");
        salario_hora = entrada.nextDouble();
        System.out.println("El porcentaje de retencion en la fuente es de 0.125 (12.5% por defecto)");
        System.out.println("Desea cambiar el porcentaje de retencion en la fuente? (1 = Si, 2 = No)");
        opcion = entrada.nextByte();

        /* Creacion del objeto empleado */
        empleado empleado = new empleado(codigo, nombre, horas_trabajo, salario_hora);

        if (opcion == 1) {
            System.out.println("Ingrese el nuevo porcentaje de retencion en la fuente:");
            double retencion = entrada.nextDouble();
            empleado.cambiar_retencion(retencion);
        }


        /* Calculo de salario bruto y neto */
        empleado.calcular_salario();

        /* Mostrar datos */
        empleado.mostrar_datos();


    }

}
