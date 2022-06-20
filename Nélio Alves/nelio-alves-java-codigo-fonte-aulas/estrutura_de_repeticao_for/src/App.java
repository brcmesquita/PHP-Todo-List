import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("Total = " + soma);
        System.out.println("- Fim do Programa -");

        sc.close();
    }
}
