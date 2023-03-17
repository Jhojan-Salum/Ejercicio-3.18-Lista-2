/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.pkg19;

/**
 *
 * @author Jhojan
 */
import java.util.Scanner;
public class Ejercicio319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el perímetro,
        el valor de la altura y el área del triángulo.  */
        Scanner sc = new Scanner(System.in);
        double lado, perimetro, altura, area;
        System.out.println("Ingrese el valor del lado del triangulo equilatero");
        lado = sc.nextDouble();
        perimetro = lado * 3;
        altura = Math.sqrt((lado*lado) - ((lado/2)*(lado/2)));
        area = (lado * altura) / 2;
        System.out.println("El perimetro del triangulo es: " + perimetro);
        System.out.println("El valor de la altura del triangulo es: " + altura);
        System.out.println("El area del triangulo es: " + area);
        
    }
    
}
