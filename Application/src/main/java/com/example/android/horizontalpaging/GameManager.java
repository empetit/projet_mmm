package com.example.android.horizontalpaging;

public class GameManager {

    private String dungeonName;

    private int level;

    public GameManager(){

        this.dungeonName = "Le donjon de naheulbeuk";
        this.level = 0;

    }

    public String getDungeonName() {
        return dungeonName;
    }

    public void setDungeonName(String dungeonName) {
        this.dungeonName = dungeonName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
