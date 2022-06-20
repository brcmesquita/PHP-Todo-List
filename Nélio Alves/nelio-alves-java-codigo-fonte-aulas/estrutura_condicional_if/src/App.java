import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int x = 5;

        System.out.println("Bom dia!");

        if (x < 0) {
            System.out.println("Boa tarde!");
        }

        System.out.println("Boa noite!");

        // ========================================== //

        int hora;
        Scanner sc = new Scanner(System.in);

        hora = sc.nextInt();
        sc.close();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else {
            System.out.println("Boa noite!");
        }

         // ========================================== //

         if (hora > 0 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        // =============================================== //
        String info = (hora > 24) ? "Hora inválida" : "Hora certa";
        System.out.println(info);




    }
}
