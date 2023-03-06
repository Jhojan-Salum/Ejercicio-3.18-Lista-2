/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.pkg18;

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
        int codigo_empleado, horas_trabajadas;
        String nombres;
        double salario_hora;
        double datos_salario[];

        System.out.println("Ingrese el código del empleado");
        codigo_empleado = entrada.nextInt();
        System.out.println("Ingrese el número de horas trabajadas");
        horas_trabajadas = entrada.nextInt();

        System.out.println("Ingrese el salario por hora");
        salario_hora = entrada.nextDouble();

    }
    static double[] datos_salario_semanal( double salario_hora, int horas){
        double retencion_fuente = 0.125;
        double datos[] = new double[3];
        
        datos[0] = salario_hora * horas;
        datos[1] = retencion_fuente * datos[0];
        datos[2] = datos[0]- datos[1];
    
        return datos;
    }
}
