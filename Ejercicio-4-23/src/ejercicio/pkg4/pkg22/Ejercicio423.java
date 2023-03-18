/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.pkg22;
import java.util.Scanner;

/**
 *
 * @author kkmie
 */
public class Ejercicio423 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] coeficientes = new double[3];
        //Lectura de los coeficientes por parte del usuario

        System.out.println("Se creara un polinomio de grado 2");
        System.out.println("Sus coeficientes se leen de izquierda a derecha, y su orden es descendente");

        for(int i = 0; i < coeficientes.length; i++){
            System.out.println("Ingrese el coeficiente " + (i + 1));
            coeficientes[i] = entrada.nextDouble();
        }

        //Testeo de la clase Polinoimio
        Grado2 polinomio = new Grado2(2, coeficientes);
        System.out.println("El polinomio es: " + polinomio.coeficientes[0] + "x^2 + " + polinomio.coeficientes[1] + "x + " + polinomio.coeficientes[2]);
        polinomio.calcular_raices();

        System.out.println("Las raices son: ");
        polinomio.mostrar_raices();
       
    }
    
}
