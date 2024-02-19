package com.step.testare.edu.step.oop;

public class Product {
    private int productId;
    private String name;
    private int price;
    private int quantity;

    public Product(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Product(int productId, String name, int price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {

        return price;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public static void main(String[] args) {
        Product product = new Product(1,"PC",12000,10);
        System.out.println(product.getPrice());
        product.setQuantity(30);
        System.out.println(product.quantity);
    }
}
