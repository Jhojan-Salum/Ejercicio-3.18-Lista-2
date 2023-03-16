/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg15;

/**
 *
 * @author Jhojan
 */
public class Contador {

    static int Contar(double[] Lista, double Item) {
        int Contador = 0;
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i] == Item) {
                Contador++;
            }
        }
        return Contador;
    }
}

    
    

