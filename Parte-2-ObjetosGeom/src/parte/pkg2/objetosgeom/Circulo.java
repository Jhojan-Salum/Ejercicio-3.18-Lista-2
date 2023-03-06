/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte.pkg2.objetosgeom;

/**
 *
 * @author kkmie
 */
public class Circulo extends FiguraGeometrica{
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double area(){
        this.area = Math.PI * Math.pow(this.radio, 2);
        return this.area;
    }
    @Override
    public double perimeter(){
        this.perimeter = 2 * Math.PI * this.radio;
        return this.perimeter;
    }
}

