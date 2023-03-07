/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.pkg22;

/**
 *
 * @author kkmie
 */
public class Ejercicio422 {

    public static void main(String[] args) {
        //Testeo de la clase Polinomio

        double[] coeficientes = {1, 2, 3};
        Polinomio polinomio = new Polinomio(2, coeficientes);
        System.out.println("El polinomio es: " + polinomio.coeficientes[0] + "x^2 + " + polinomio.coeficientes[1] + "x + " + polinomio.coeficientes[2]);
       
    }
    
}
