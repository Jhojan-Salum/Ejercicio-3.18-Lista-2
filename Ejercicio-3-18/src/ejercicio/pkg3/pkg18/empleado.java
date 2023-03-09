/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3.pkg18;

/**
 *
 * @author kkmie
 */
public class empleado {
    
    private int codigo_empleado;
    private String nombres;
    private int horas_trabajadas;
    private double salario_hora;
    private double retencion_fuente = 0.125;
    private double salario_bruto;
    private double salario_neto;
    
    public empleado(int codigo_empleado, String nombres, int horas_trabajadas, double salario_hora){
        this.codigo_empleado = codigo_empleado;
        this.nombres = nombres;
        this.horas_trabajadas = horas_trabajadas;
        this.salario_hora = salario_hora;
    }

    public void cambiar_retencion(double retencion_fuente){
        this.retencion_fuente = retencion_fuente;
    }
    
    public void calcular_salario(){
        this.salario_bruto = this.salario_hora * this.horas_trabajadas;
        this.salario_neto = this.salario_bruto - (this.salario_bruto * this.retencion_fuente);
    }
    
    public void mostrar_datos(){
        System.out.println("Código del empleado: " + this.codigo_empleado);
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Salario bruto: " + this.salario_bruto);
        System.out.println("Salario neto: " + this.salario_neto);
    }
}
