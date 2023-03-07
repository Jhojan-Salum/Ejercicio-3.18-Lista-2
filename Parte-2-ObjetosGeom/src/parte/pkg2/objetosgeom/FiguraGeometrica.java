/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte.pkg2.objetosgeom;

/**
 *
 * @author kkmie
 */
public class FiguraGeometrica {
    /*Atributos protegidos, asi la unica forma de acceder a ellos es a traves de sus metodos,
    evitando imprimir valores desactualizados.
    */
    protected double perimeter;
    protected double area;

    public double area(){
        this.area = 0;
        return this.area;        
    }

    public double perimeter(){
        this.perimeter = 0;
        return this.perimeter;
    }
}
