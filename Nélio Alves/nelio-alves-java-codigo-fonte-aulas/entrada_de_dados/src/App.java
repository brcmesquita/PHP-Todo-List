import java.util.Scanner; // importar o Scanner

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String texto;
        int inteiro;
        double decimal;

        System.out.println("Digite algum texto:");
        texto = sc.next();

        System.out.println("Digite algum número inteiro:");
        inteiro = sc.nextInt();

        System.out.println("Digite algum número decimal:");
        decimal = sc.nextDouble(); // ele aceita a localidade do Brasil, então precisa ser com vírgula

        sc.close(); // necessário fechar o Scanner ao final do arquivo, ou quando não for mais utilizar

        System.out.println(texto.charAt(0)); // imprime a primeira letra (índice 0) de uma string

        System.out.printf("Você digitou o seguinte:%nNome: %s%nIdade: %d%nSalário: %.2f %n", texto, inteiro, decimal);

        System.out.println("- Fim do programa. -");
    }
}
