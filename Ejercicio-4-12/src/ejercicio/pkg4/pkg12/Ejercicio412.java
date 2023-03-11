/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.pkg12;

/**
 *
 * @author Jhojan
 */
import java.util.Scanner;
public class Ejercicio412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pedimos los datos del empleado
        Scanner sc = new Scanner(System.in);
        String nombres;
        int horasTrabajadas;
        double valorHora, salario;
        System.out.println("Ingrese el nombre del empleado");
        nombres = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas = sc.nextInt();
        System.out.println("Ingrese el valor de la hora");
        valorHora = sc.nextDouble();

        //Creamos el objeto empleado
        Empleado empleado = new Empleado(nombres, horasTrabajadas, valorHora);

        //Calculamos el salario
        //Si se pasa de 40 horas, se le paga el doble las horas extras, pero si se pasa de 8 horas extras, se le paga el triple.
        if (empleado.horasTrabajadas > 40 && empleado.horasTrabajadas <= 48) {
            salario = (empleado.horasTrabajadas - 40) * (empleado.valorHora * 2) + (40 * empleado.valorHora);
        } else if (empleado.horasTrabajadas > 48) {
            salario = (empleado.horasTrabajadas - 48) * (empleado.valorHora * 3) + (8 * empleado.valorHora * 2) + (40 * empleado.valorHora);
        } else {
            salario = empleado.horasTrabajadas * empleado.valorHora;
        }        
        
        //Imprimimos el salario
        System.out.println("El salario del empleado " + empleado.nombres+ " es de: "+ salario);

        
}
}
