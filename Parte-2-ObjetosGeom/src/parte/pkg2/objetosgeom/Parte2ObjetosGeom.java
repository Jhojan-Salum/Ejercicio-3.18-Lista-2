/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte.pkg2.objetosgeom;

/**
 *
 * @author kkmie
 */
public class Parte2ObjetosGeom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Testing the Subclass Rectangulo
        Rectangulo r1 = new Rectangulo(2, 3);
        System.out.println("Rectangulo");
        System.out.println("Base: " + r1.base);
        System.out.println("Altura: " + r1.altura);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimetro: " + r1.perimeter());

        // Testing the Subclass Cuadrado
        System.out.println("");

        Cuadrado c1 = new Cuadrado(2);
        System.out.println("Cuadrado");
        System.out.println("Lado: " + c1.lado);
        System.out.println("Area: " + c1.area());
        System.out.println("Perimetro: " + c1.perimeter());

        // Testing the Subclass Circulo
        System.out.println("");

        Circulo ci1 = new Circulo(3);
        System.out.println("Circulo");
        System.out.println("Radio: " + ci1.radio);
        System.out.println("Area: " + ci1.area());
        System.out.println("Perimetro: " + ci1.perimeter());
        
       // Testing the Subclass Triangulo
        Triangulo_rectangulo tr1 = new Triangulo_rectangulo(2, 3);
        System.out.println("Triángulo Rectangulo");
        System.out.println("Base: " + tr1.base);
        System.out.println("Altura: " + tr1.altura);
        System.out.println("Area: " + tr1.area());
        System.out.println("Perimetro: " + tr1.perimeter());

        

    }
    
}
