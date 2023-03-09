/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.pkg23;
import java.util.Scanner;

/**
 *
 * @author kkmie
 */
public class Ejercicio422 {

    public static void main(String[] args) {
        //Creamos la variables a utilizar
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double horas_mensuales;
        double salario_hora;

        //Pedimos los datos al usuario
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese las horas mensuales trabajadas por el empleado: ");
        horas_mensuales = entrada.nextInt();
        System.out.println("Ingrese el salario por hora del empleado: ");
        salario_hora = entrada.nextDouble();

        //Creamos el objeto empleado
        empleado empleado = new empleado(nombre, horas_mensuales, salario_hora);

        //Procedemos a motrar los datos
        empleado.mostrar_datos();
    }
    
}
