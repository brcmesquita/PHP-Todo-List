import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int x = 1;
        
        
        while (x != 0) {
            x = sc.nextInt();
            System.out.printf("Você digitou: %d%n", x);
        }

        System.out.println("- Fim do Programa -");

        sc.close();
    }
}
