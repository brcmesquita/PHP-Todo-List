import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++){

            vetor[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++){
            System.out.println("Você digitou -> " + vetor[i]);
        }

        int soma = 0;

        for (int i = 0; i < n; i++){
            soma += vetor[i];
        }

        System.out.println("Resultado -> " + soma);
    }
}
