/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio.pkg4.pkg24;

/**
 *
 * @author jteheranm
 */
public class comparador {
        
        public static void comparar(double peso1, double peso2, double peso3) {
            
            //Creacion de los objetos
            esfera esfera1 = new esfera(peso1);
            esfera esfera2 = new esfera(peso2);
            esfera esfera3 = new esfera(peso3);
            
            //Comparacion de los pesos de las esferas, se devuelve la esfera o esferas con mayor peso
            if (esfera1.peso > esfera2.peso && esfera1.peso > esfera3.peso) {
                System.out.println("La esfera 1 es la de mayor peso");
            } else if (esfera2.peso > esfera1.peso && esfera2.peso > esfera3.peso) {
                System.out.println("La esfera 2 es la de mayor peso");
            } else if (esfera3.peso > esfera1.peso && esfera3.peso > esfera2.peso) {
                System.out.println("La esfera 3 es la de mayor peso");
            } else if (esfera1.peso == esfera2.peso && esfera1.peso == esfera3.peso) {
                System.out.println("Las esferas 1, 2 y 3 tienen el mismo peso");
            } else if (esfera1.peso == esfera2.peso && esfera1.peso > esfera3.peso) {
                System.out.println("Las esferas 1 y 2 tienen el mismo peso y son las de mayor peso");
            } else if (esfera1.peso == esfera3.peso && esfera1.peso > esfera2.peso) {
                System.out.println("Las esferas 1 y 3 tienen el mismo peso y son las de mayor peso");
            } else if (esfera2.peso == esfera3.peso && esfera2.peso > esfera1.peso) {
                System.out.println("Las esferas 2 y 3 tienen el mismo peso y son las de mayor peso");
            }
        }
}
