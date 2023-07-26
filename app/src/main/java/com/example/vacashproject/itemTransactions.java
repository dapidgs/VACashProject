package com.example.vacashproject;

import java.util.Date;

public class itemTransactions {
    String nameShop;
    String nameGame;
    String detailGame;
    Date dateOrder;
    int priceGame;
    int qty;
    int totalPrice;
    int imageGame;

    public itemTransactions(String nameShop, String nameGame, String detailGame, Date dateOrder, int priceGame, int qty, int totalPrice, int imageGame) {
        this.nameShop = nameShop;
        this.nameGame = nameGame;
        this.detailGame = detailGame;
        this.dateOrder = dateOrder;
        this.priceGame = priceGame;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.imageGame = imageGame;
    }

}
