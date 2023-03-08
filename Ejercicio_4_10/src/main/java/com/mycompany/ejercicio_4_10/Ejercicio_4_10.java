
package com.mycompany.ejercicio_4_10;
import java.util.Scanner;

public class Ejercicio_4_10 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    double NI;
    String NOM;
    double PAT;
    int ES;
    double PAGMAT;
   
    PAGMAT = 50000;
    System.out.print("Ingrese el Nombre: ");
    NOM = sc.nextLine();
    System.out.print("Ingrese el valor de Patrimonio: ");
    PAT = sc.nextDouble();
    System.out.print("Ingrese el valor de Estrato: ");
    ES = sc.nextInt();
    System.out.print("Ingrese el Numero de la inscripcion: ");
    NI = sc.nextDouble();
   
    if (PAT > 2000000 && ES > 3) {
    PAGMAT = PAGMAT + (0.03 * PAT);
       System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + NI + NOM + " DEBE PAGAR: $" + PAGMAT );
    }else { 
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + NI + NOM + " DEBE PAGAR: $" + PAGMAT );
            }
  
    }
  }

 
 
