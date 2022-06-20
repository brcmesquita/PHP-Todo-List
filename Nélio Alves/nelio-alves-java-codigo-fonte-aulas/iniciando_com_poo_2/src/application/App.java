package application;

import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int aux = 0;

        System.out.println("..:: Insira os dados do produto ::..");
        
        System.out.print("Nome do produto: ");
        String name = sc.next();
        
        System.out.print("Preço: $");
        double price = sc.nextDouble();
        
        System.out.print("Quantidade: ");
        int quantity = sc.nextInt();

        Product produto = new Product(name, price, quantity);

        System.out.println("Produtos Cadastrados: " + produto.toString());
        
        System.out.print("Insira a quantidade de produtos que quer adicionar: ");
        aux = sc.nextInt();
        produto.addProducts(aux);
        System.out.println("Produtos Atualizados: " + produto.toString());

        System.out.print("Insira a quantidade de produtos que quer remover:");
        aux = sc.nextInt();
        produto.removeProducts(aux);

        System.out.println("Produtos Atualizados: " + produto.toString());

        sc.close();
    }
}