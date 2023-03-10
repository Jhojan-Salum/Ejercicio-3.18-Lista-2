/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio.pkg4.pkg24;
import java.util.Scanner;
/**
 *
 * @author Jteheranm
 */
public class Ejercicio424 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Incializacion de variables, para comparar los pesos de las esferas
        double peso1, peso2, peso3;
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos por teclado
        System.out.println("Ingrese el peso de la esfera 1: ");
        peso1 = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera 2: ");
        peso2 = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera 3: ");
        peso3 = entrada.nextDouble();

        //Comparamos los pesos con la clase comparador (En la clase comparador se instancian las esferas)
        //Y se imprime un mensaje indicando la esfera con mayor peso

        comparador.comparar(peso1, peso2, peso3);

    }

}
