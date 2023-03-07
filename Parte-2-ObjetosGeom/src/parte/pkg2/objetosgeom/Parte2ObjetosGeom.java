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


    }
    
}
