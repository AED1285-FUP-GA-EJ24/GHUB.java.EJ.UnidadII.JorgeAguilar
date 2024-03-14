package triangulo;
import java.util.Scanner;

public class Triangulo {
    public void calcularPerimetroSuperficie(){
        //declaro objeto tipo Scanner
        Scanner entrada = new Scanner(System.in);
        //definir variable de salida
        double per,sup;
        //definir variable de entrada
        double base,altura;
        //definir variable auxiliar
        double hip;

        System.out.println("Proporciona base: ");
        base = entrada.nextDouble();
        System.out.println("Proporciona altura: ");
        altura = entrada.nextDouble();

        sup = (base*altura)/2;

        hip = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));

        per = base + altura + hip;

        System.out.println("Superficie = "+sup);
        System.out.println("Perimetro = "+per);
        
        entrada.close();

        
    }
}