/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg23;

/**
 *
 * @author kkmie
 */
public class empleado {

    /*Declaracion de atributos */
    
    private String nombre;
    private int horas_mensuales;
    private double salario_hora;
    
    /*Declaracion de metodos*/

    public empleado(String nombre, int horas_mensuales, double salario_hora){
        this.nombre = nombre;
        this.horas_mensuales = horas_mensuales;
        this.salario_hora = salario_hora;
    }

    public void mostrar_datos(){
       if (this.horas_mensuales*this.horas_mensuales > 450000){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario mensual: " + (this.salario_hora * this.horas_mensuales));
       }else{
        System.out.println("Nombre: " + this.nombre);
       }
    }
}
