package fr.istic.m2miage.dungeonassault;

public class GameManager {

    private String dungeonName;

    private int level;

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

    public Dungeon getCurrentDungeon() {
        return currentDungeon;
    }

    public void setCurrentDungeon(Dungeon currentDungeon) {
        this.currentDungeon = currentDungeon;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    private Dungeon currentDungeon;
    private Player currentPlayer;

    public GameManager(){
    }

    public void updateGame() {
    }

    public void updatePlayer() {
    }

    public void updateInventaire() {
    }
}
