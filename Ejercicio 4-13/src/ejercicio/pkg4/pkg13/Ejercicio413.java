/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio.pkg4.pkg13;

/**
 *
 * @author Jhojan
 */
import java.util.Scanner;
public class Ejercicio413 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Cobraremos un descuento dependiendo del color, si la bolita es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, 
        si es amarilla un 25%, si es azul un 50% y si es roja un 100%. */
        Scanner entrada = new Scanner(System.in);
        int color;
        double precio, descuento, total;
        System.out.println("Ingrese el precio del producto: ");
        precio = entrada.nextDouble();
        System.out.println("Ingrese el color de la bolita: \n1. Blanco \n2. Verde \n3. Amarillo \n4. Azul \n5. Rojo");
        color = entrada.nextInt();
        switch(color){
            case 1:
                descuento = 0;
                total = precio - descuento;
                System.out.println("El precio del producto es: " + precio + " y el descuento es: " + descuento + " y el total a pagar es: " + total);
                break;
            case 2:
                descuento = precio * 0.10;
                total = precio - descuento;
                System.out.println("El precio del producto es: " + precio + " y el descuento es: " + descuento + " y el total a pagar es: " + total);
                break;
            case 3:
                descuento = precio * 0.25;
                total = precio - descuento;
                System.out.println("El precio del producto es: " + precio + " y el descuento es: " + descuento + " y el total a pagar es: " + total);
                break;
            case 4:
                descuento = precio * 0.50;
                total = precio - descuento;
                System.out.println("El precio del producto es: " + precio + " y el descuento es: " + descuento + " y el total a pagar es: " + total);
                break;
            case 5:
                descuento = precio * 1;
                total = precio - descuento;
                System.out.println("El precio del producto es: " + precio + " y el descuento es: " + descuento + " y el total a pagar es: " + total);
                break;
            default:
                System.out.println("El color ingresado no es valido");
                break;
        }
        
    }

}
