package puntaje;
/* Proposito: Obtener puntaje considerando que las respuestas
 * correctas valen 4 puntos, las incorrectas -1 punto 
 * y las en blanco 0 punto
 * Fecha: 13/marzo/2024
 */
import java.util.Scanner;
public class Puntaje {
    public void calcularPuntaje(){
        //declarar objeto Scanner
        Scanner entrada = new Scaner(System.in);
        //variables de entrada
        int c,i,b;
        //variables de salida
        int p;
        System.out.println("Proporciona respuestas correctas: ");
        c = entrada.nextInt();
        System.out.println("Proporciona respuestas icorrectas: ");
        i = entrada.nextInt();
        System.out.println("Proporciona respuestas en blanco: ");
        b = entrada.nextInt();

        p = c*4 - i + b*0;

        System.out.println("Puntaje obtenido = "+p);
        
        entrada.close();
    }

}