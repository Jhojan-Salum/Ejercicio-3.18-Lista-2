/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte.pkg2.objetosgeom;

/**
 *
 * @author kkmie
 */
public class Cuadrado extends FiguraGeometrica{
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double area(){
        this.area = Math.pow(this.lado, 2);
        return this.area;
    }

    @Override
    public double perimeter(){
        this.perimeter = 4 * this.lado;
        return this.perimeter;
    }

    
}
