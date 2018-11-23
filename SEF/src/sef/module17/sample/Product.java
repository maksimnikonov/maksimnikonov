package sef.module17.sample;
// Complete Code

import java.io.Serializable;

public class Product implements Serializable {

    private String description;
    private Double price;
    private String name;
    private int id;

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description);
        buffer.append(" Price: " + price );
        buffer.append(" Name: " + name);
        buffer.append(" ID: " + id);
        return buffer.toString();
    }

    public String getProductInformation() {
        return "The product with id: " + id + " and name: " + name + " has price: " + price + " and description: " + description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals(" ")) {
            this.name = name;
            this.name = name.toUpperCase();
        } else {
            this.name = "Unknown";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
            this.id = id;
    }
}
