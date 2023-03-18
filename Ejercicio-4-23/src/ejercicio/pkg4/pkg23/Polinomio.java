/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg22;

/**
 *
 * @author kkmie
 */
public class Polinomio {

    protected int grado;
    protected double[] coeficientes;
    protected double[] raices;

    /*Constructor por defecto*/
    /* Los coeficientes se leen de izquierda a derecha, y su orden es 
    descendente respecto a su grado*/

    public Polinomio(int grado, double[] coeficientes) {
        this.grado = grado;
        this.coeficientes = coeficientes;
        this.raices = new double[grado];
    }

    public double[] Coeficientes() {
        return coeficientes;
    }

    public void setCoeficientes(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }
    
}
