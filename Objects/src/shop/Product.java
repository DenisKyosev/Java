package shop;

import java.math.BigDecimal;

public class Product {

    private int productID = 0;
    private String name;
    private String description;
    private BigDecimal price;
    private int amount;

    // Creates a new products

    public Product(String name, String description, BigDecimal price, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productID++;
        this.setAmount(amount);
    }

     // the product's ID
    public int getProductID() {
        return productID;
    }

    //the product's name
    public String getProductName() {
        return name;
    }

    //the product's description
    public String getDescription() {
        return description;
    }

    // the product's price
    public BigDecimal getPrice() {
        return price;
    }

    //the product's amount
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("The product's amount cannot be under zero");
        }

        this.amount = amount;
    }
}