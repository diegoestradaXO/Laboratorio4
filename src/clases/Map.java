package clases;

import java.awt.*;
import java.util.ArrayList;

public class Map {
    //atributos de la clase
    private ArrayList<Wall> walls;
    private ArrayList<CoinsPlie> coins;
    private Robot robot;
    private int height;
    private int width;
    //valores constantes, para los movimientos que el usuario agregará
    public static final String MOVE = "MOVE";
    public static final String ROTATE = "ROTATE";
    public static final String PICK = "PICK";
    //Constructor de mapa
    public Map() {
        this.walls = new ArrayList<Wall>();
        this.coins = new ArrayList<CoinsPlie>();
    }


    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }

    public void setWalls(ArrayList<Wall> walls) {
        this.walls = walls;
    }

    public ArrayList<CoinsPlie> getCoins() {
        return coins;
    }

    public void setCoins(ArrayList<CoinsPlie> coins) {
        this.coins = coins;
    }
}
