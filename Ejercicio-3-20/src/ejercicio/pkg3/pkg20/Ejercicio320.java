
package ejercicio.pkg3.pkg20;
import java.util.Scanner;
public class Ejercicio320 {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*determine los parámetros A, B y C de una recta que pasa por los puntos (X1, Y1) y (X2, Y2). 
    La ecuación de la recta es: AX + BY + C = 0.  */
    double x1, x2, y1, y2, a, b, c;
    System.out.println("ingresa el valor de x1");
    x1 = sc.nextDouble();
    System.out.println("ingresa el valor de y1");
    y1 = sc.nextDouble();
    System.out.println("ingresa el valor de x2");
    x2 = sc.nextDouble();
    System.out.println("ingresa el valor de y2");
    y2 = sc.nextDouble();

    //ecuacion de la recta (Hallada de despejar y = ax + b)
    a = -(y2-y1)/(x2-x1);
    b = 1;
    c=-(y1+y2+a*(x1+x2))/2;

    //imprimir resultados
    System.out.println("El valor de a es: "+ a);
    System.out.println("El valor de b es: "+ b);
    System.out.println("El valor de c es: "+ c);

  }
}

