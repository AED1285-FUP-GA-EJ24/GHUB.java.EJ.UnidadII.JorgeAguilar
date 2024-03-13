package partido;
import java.util.Scanner;

public class Partido {
    public void calcularPuntaje(){
        //definir objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //definir variable de entrada
        short g,p,e;
        //Definir variable de salida
        int puntos;

        System.out.println("Proporciona Partidos ganados: ");
        g = teclado.nextShort();
        System.out.println("Proporciona Partidos empatados: ");
        e = teclado.nextShort();
        System.out.println("Proporciona Partidos perdidos: ");
        p = teclado.nextShort();
        
        //puntos = g*3 + e + p*0;

        puntos = (short)(g*3 + e);

        System.out.println("Puntaje obtenido: "+puntos);

        teclado.close();
    }
}