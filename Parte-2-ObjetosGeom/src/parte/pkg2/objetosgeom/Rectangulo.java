/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte.pkg2.objetosgeom;

/**
 *
 * @author Jhojan
 */
public class Rectangulo extends FiguraGeometrica{
    double base;
    double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public double area(){
        return base * altura;
    }
    
    @Override
    public double perimeter(){
        return 2 * (base + altura);
    }
}
