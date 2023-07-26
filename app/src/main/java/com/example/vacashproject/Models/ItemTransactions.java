package com.example.vacashproject.Models;

public class ItemTransactions {
    private int imageItem;
    private String qty;
    private String totalPrice;
    private String nameShop;
    private String nameGame;
    private String itemName;


    public int getImageItem() {
        return imageItem;
    }

    public void setImageItem(int imageItem) {
        this.imageItem = imageItem;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getNameGame() {
        return nameGame;
    }

    public void setNameGame(String nameGame) {
        this.nameGame = nameGame;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemTransactions(int imageItem, String qty, String totalPrice, String nameShop, String nameGame, String itemName) {
        this.imageItem = imageItem;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.nameShop = nameShop;
        this.nameGame = nameGame;
        this.itemName = itemName;
    }
}
