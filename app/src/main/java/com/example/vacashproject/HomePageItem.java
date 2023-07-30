package com.example.vacashproject;
import java.io.Serializable;

public class HomePageItem implements Serializable {
    String name, gameType;
    int image;

    public HomePageItem(String name, int image, String gameType) {
        this.name = name;
        this.image = image;
        this.gameType = gameType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
