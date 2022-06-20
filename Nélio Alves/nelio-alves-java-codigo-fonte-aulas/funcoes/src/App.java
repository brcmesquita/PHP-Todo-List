import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // exemplo de função para saber qual número é maior
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores para descobrir o maior:");
        
        n1 = sc.nextInt();
        sc.nextLine();

        n2 = sc.nextInt();
        sc.nextLine();

        n3 = sc.nextInt();
        sc.nextLine();

        sc.close();

        int resultado = verificaMaior(n1, n2, n3);

        imprimeMaior(resultado);
    }
    
    public static int verificaMaior(int a, int b, int c){
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
    
    public static void imprimeMaior(int valor) {
        System.out.println("O maior é:" + valor);
    }
}
