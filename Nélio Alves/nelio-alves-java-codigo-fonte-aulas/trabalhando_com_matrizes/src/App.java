import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("..:: Trabalhando com Matrizes ::..\n\n");
        
        System.out.println("..:: Digite o tamanho da matriz");

        // chamando o objeto scanner
        Scanner sc = new Scanner(System.in);

        // perguntando ao usuário o tamanho da matriz
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0;j < matriz.length; j++) {
                System.out.println("Digite um subvalor");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
                System.out.println("valor -> " + matriz[i][i]);
        }
    }
}
