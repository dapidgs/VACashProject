package com.example.vacashproject.item;

import java.io.Serializable;

public class GameItem implements Serializable {
    String name, shopName, description;
    Float price;
    int image;

    public GameItem(String name, String description, String shopName, Float price, int image) {
        this.name = name;
        this.description = description;
        this.shopName = shopName;
        this.price = price;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
