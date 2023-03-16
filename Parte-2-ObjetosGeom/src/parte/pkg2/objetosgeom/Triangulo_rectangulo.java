
package parte.pkg2.objetosgeom;

public class Triangulo_rectangulo extends FiguraGeometrica {
    double base;
    double altura;
    
public Triangulo_rectangulo(double base, double altura){
   
    this.base = base;
    this.altura = altura;
}
    @Override
    public double area(){
      return (base * altura/2);
     
}
    @Override
    public double perimeter(){
      return (base + altura + calcularHipotenusa());
     
}
    double calcularHipotenusa(){
      return Math.pow(base*altura + altura*altura, 0.5);
 }

public void determinarTipoTriangulo(){
    if((base==altura)&&(base==calcularHipotenusa())&&(altura == calcularHipotenusa())){
        System.out.println("Es un triángulo equilatero");
      }
    else if((base != altura)&&(base != calcularHipotenusa())&&(altura != calcularHipotenusa())){
        System.out.println("Es un triángulo escaleno");
      }
    else {
        System.out.println("Es un triángulo isósceles ");
    }
}
}
