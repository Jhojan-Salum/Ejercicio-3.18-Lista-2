/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.pkg18;

/**
 *
 * @author kkmie
 */
public class Ejercicio318 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nothing wrong with me");
        int x = 10;
        
        System.out.println("por cada "+x+" estudiantes de POO, "+x/2+" son la mitad de ellos");
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
