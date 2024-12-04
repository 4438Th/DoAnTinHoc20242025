package Models;

import java.time.LocalDate;

public class Product {

    //Field
    private String id;
    private String name;
    private LocalDate date;//yyyy-MM-dd
    private int quantity;
    private double price;

    //Constructor
    public Product() {
        this.id = null;
        this.name = null;
        this.date = null;
        this.quantity = 0;
        this.price = 0;
    }

    public Product(String id, String name, LocalDate date, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.quantity = quantity;
        this.price = price;

    }

    public Product(Product original) {
        this.id = original.getId();
        this.name = original.getName();
        this.date = original.getDate();
        this.quantity = original.getQuantity();
        this.price = original.getPrice();
    }

    //Property

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
