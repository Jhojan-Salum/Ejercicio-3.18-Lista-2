/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.pkg15;

/**
 *
 * @author Jhojan
 */
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio415 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double[] Lista = new double[4];
        int Item;
        char[] Respuestas = {'A','B','C','D'};

        System.out.println("Ingrese el peso de la bola A");
        Lista[0] = sc.nextDouble();
        System.out.println("Ingrese el peso de la bola B");
        Lista[1] = sc.nextDouble();
        System.out.println("Ingrese el peso de la bola C");
        Lista[2] = sc.nextDouble();
        System.out.println("Ingrese el peso de la bola D");
        Lista[3] = sc.nextDouble();
        
        for (int i = 0; i < Lista.length; i++) {

            if (Contador.Contar(Lista, Lista[i]) == 1) {
                if (Lista[Math.abs(i-1)]<Lista[i]) {
                    System.out.println("La bola "+ Respuestas[i]+" es diferente y la mas pesada");
                }
                else{
                    System.out.println("La bola "+Respuestas[i]+" es diferente y la mas liviana");
                }
        }


    }
    
    }
}
