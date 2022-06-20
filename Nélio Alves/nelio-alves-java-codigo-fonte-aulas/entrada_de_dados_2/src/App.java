import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n1;
        String s1, s2, s3;

        System.out.println("Digite um número inteiro");
        n1 = sc.nextInt();
        sc.nextLine(); // um nextline vazio deve ser inserido para funcionar corretamente (bugs do Java)
        int soma = 100 + n1;

        System.out.println("Digite um texto 3 vezes");
        s1 = sc.nextLine(); // observação, o next lê apenas uma palavra, já o nextline lê a linha inteira
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.printf("Preço: %d%n",soma);
        System.out.println(s1);
        System.out.println(s2); 
        System.out.println(s3);
    }
}
