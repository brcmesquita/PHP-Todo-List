import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		{
			// System.out.println("Olá mundo!");
		
			// double x = 10.35784;				// criar uma variavel que recebe um double
			// System.out.println(x);				// imprimir o valor da variavel
			// System.out.printf("%.2f%n", x); 	// imprimir variavel com 2 casas decimais
			// System.out.printf("%.4f%n", x); 	// imprimir variavel com 4 casas decimais
			// Locale.setDefault(Locale.US);		// configurar para imprimir regionalizado para Estados Unidos 
			// System.out.printf("%.4f%n", x);		// imprimir variavel regionalizada para US
			// System.out.println("RESULTADO = " + x + " METROS"); // exemplo de concatenação
			// System.out.printf("RESULTADO = %.2f metros%n", x);
		
			// String nome = "Bruno Raphael";
			// int idade = 37;
			// double renda = 300.00;
			// // %s = para imprimir Strings
			// // %d = para imprimir números inteiros
			// // %f = para imprimir números decimais
			// // %n = para pular uma linha
			// System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		}

	System.out.println("Digite o seu nome:");

	Scanner andy = new Scanner(System.in);

	String joao = andy.nextLine();

	System.out.println("Olá, " + joao + "!");

	}

}
