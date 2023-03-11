
package parte.pkg2.objetosgeom;

public class Triangulo_rectangulo extends FiguraGeometrica {
    int base;
    int altura;
    
public void Tiangulo_rectangulo(int base, int altura){
   
    this.base = base;
    this.altura = altura;
}
    double calcularArea(){
      return (base * altura/2);
     
}
    double calcularPerimetro(){
      return (base + altura + calcularHipotenusa());
     
}
    double calcularHipotenusa(){
      return Math.pow(base*altura + altura*altura, 0.5);
 }

void determinarTipoTriangulo(){
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
