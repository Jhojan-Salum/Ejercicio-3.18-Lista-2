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
            if (esfera1.get_peso() > esfera2.get_peso() && esfera1.get_peso() > esfera3.get_peso()) {
                System.out.println("La esfera 1 es la que tiene mayor peso");
            } else if (esfera2.get_peso() > esfera1.get_peso() && esfera2.get_peso() > esfera3.get_peso()) {
                System.out.println("La esfera 2 es la que tiene mayor peso");
            } else if (esfera3.get_peso() > esfera1.get_peso() && esfera3.get_peso() > esfera2.get_peso()) {
                System.out.println("La esfera 3 es la que tiene mayor peso");
            } else {
                System.out.println("Las esferas tienen el mismo peso");
            }
        }
}
