package promedio;
// Proposito: Calcular promedio a partir de 3 parciales
// Autor: Jorge Aguilar
// Fecha: 12/marzo/2024
import java.util.Scanner;
public class Pincipal {
    public void calcularPromedio() {
        Scanner teclado = new Scanner(System.in);
        //declarando la variable de salida
        int r;
        //declarando las variables de entrada
        int n1,n2,n3;
        System.out.println("Proporciona parcial 1: ");
        n1 =  teclado.nextInt();
        System.out.println("Proporciona parcial 2: ");
        n2 =  teclado.nextInt();
        System.out.println("Proporciona parcial 3: ");
        n3 =  teclado.nextInt();
        r = (n1+n2+n3)/3;
    }
    
}
