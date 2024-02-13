package oop;

public class Product {
    int Id;
    String name;
    double price;
    int quantity;
    public Product(int productId) {
        this.Id = productId;
    }
    public Product(int productId, String name, double price, int quantity) {
        this.Id = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
            System.out.println("Cantitatea " + name + " a fost actualizata cu " + newQuantity);
        } else {
            System.out.println("Cantitatea nu e valida");
        }
    }
    public int getProductId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            System.out.println("Pretul produslui " + name + " a fost actualizat la " + price);
        } else {
            System.out.println("Pretul nu e valid");
        }
    }
}