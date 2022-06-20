package entities;

/**
 * Product
 */
public class Product {

  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price){
    this.name = name;
    this.price = price;
  } 

  public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public double getPrice(){
    return price;
  }

  public int getQuantity(){
    return quantity;
  }

  public double totalValueInStock() {
    return price * this.quantity;
  }

  public int addProducts(int quantity) {
    return this.quantity += quantity;
  }

  public int removeProducts(int quantity) {
    return this.quantity -= quantity;
  }

  public String toString(){
    return "Nome: " + name
    + ", Preço: $" + String.format("%,3.2f", price)
    + ", Quantidade: " + quantity
    + ", Total: $" + String.format("%,3.2f", totalValueInStock())
    + "\n";
  }
  
}