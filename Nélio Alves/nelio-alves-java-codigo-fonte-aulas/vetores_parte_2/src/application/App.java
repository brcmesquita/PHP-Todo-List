package application;

import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); // chama o objeto Scanner pra fazer a leitura
        
        System.out.println("..:: Quantos produtos deseja cadastrar? ::..");

        int n = sc.nextInt(); // fazemos a leitura de um inteiro e armazenamos na variável n

        Product[] product = new Product[n];

        System.out.println("..:: Cadastre os produtos ::..");
        
        for (int i = 0; i < product.length; i++) {
            sc.nextLine();
            System.out.print("Produto: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            product[i] = new Product(name, price);
        }
        
        System.out.println("\n..:: Produtos Cadastrados ::..");
        
        for (int i = 0; i < product.length; i++) {
            System.out.print("Produto: ");
            System.out.println(product[i].getName());
            System.out.print("Preço: ");
            System.out.println(product[i].getPrice());
        }
        
        System.out.println("\n..:: Total dos Produtos ::..");

        double soma = 0.0;
        for (int i = 0; i < n; i++){
            soma += product[i].getPrice();
        }

        System.out.println("Total: " + String.format("%.2f", soma));
        System.out.println("Média: " + String.format("%.2f", soma / product.length));

        sc.close();
        
    }
}
