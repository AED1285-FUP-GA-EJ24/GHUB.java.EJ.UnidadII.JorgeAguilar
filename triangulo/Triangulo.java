package triangulo;
import java.util.Scanner;

public class Triangulo {
    public void calcularPerimetroSuperficie(){
        //declaro objeto tipo Scanner
        Scanner entrada = new Scanner(System.in);
        //definir variable de salida
        float per,sup;
        //definir variable de entrada
        float base,altura;
        //definir variable auxiliar
        float hip;

        System.out.println("Proporciona base: ");
        base = entrada.nextFloat();
        System.out.println("Proporciona altura: ");
        altura = entrada.nextFloat();

        sup = (base*altura)/2;

        hip = (float)Math.sqrt((Math.pow(base, 2))+(float)(Math.pow(altura, 2)));

        per = base + altura + hip;

        System.out.println("Superficie = "+sup);
        System.out.println("Perimetro = "+per);
        
        entrada.close();

        
    }
}