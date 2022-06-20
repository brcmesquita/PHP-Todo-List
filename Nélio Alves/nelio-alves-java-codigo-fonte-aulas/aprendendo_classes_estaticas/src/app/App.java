package app;

import java.util.Scanner;
import util.Calculator;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio:");
        double radius = sc.nextDouble();

        double c = Calculator.circunferencia(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}
