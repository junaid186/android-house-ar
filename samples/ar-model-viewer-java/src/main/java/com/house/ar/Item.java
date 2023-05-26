package com.house.ar;

public class Item {
    int image ;
    String name;
    String title;
    String description;
    double price;

    public Item(int image, String name, String title, double price, String description) {
        this.image = image;
        this.name = name;
        this.title = title;
        this.price = price;
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
