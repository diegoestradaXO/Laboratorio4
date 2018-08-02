package clases;

public class Robot {
    private int [] position;
    private int direction;
    private int coins;
    //CONSTANTES
    public static final int DIRECTION_INDICATOR_UP = 0;
    public static final int DIRECTION_INDICATOR_RIGHT = 1;
    public static final int DIRECTION_INDICATOR_DOWN = 2;
    public static final int DIRECTION_INICATOR_LEFT= 3;
    public static final String DIRECTION_SYMBOL_UP = "^";
    public static final String DIRECTION_SYMBOL_RIGHT = ">";
    public static final String DIRECTION_SYMBOL_DOWN = "v";
    public static final String DIRECTION_SYMBOL_LEFT = "<";

    public Robot(int row, int column, int direction) {
        this.position = new int[2];
        this.direction = direction;
        this.coins = 0;
        this.position[0] = row;
        this.position[1] = column;
        }


    public void move(){
        switch(this.direction){
            case 1:
        }
    }
    //ROTATE
    public void rotate() {
        if(this.direction == DIRECTION_INDICATOR_UP){
            this.direction = DIRECTION_INDICATOR_RIGHT;
        }
        if(this.direction == DIRECTION_INDICATOR_RIGHT){
            this.direction = DIRECTION_INDICATOR_DOWN;
        }
        if(this.direction == DIRECTION_INDICATOR_DOWN){
            this.direction = DIRECTION_INICATOR_LEFT;
        }
        if(this.direction == DIRECTION_INICATOR_LEFT){
            this.direction = DIRECTION_INDICATOR_UP;
        }
    }

    //PICK

    public int getCoins() {
        return coins;
    }
    public void pickCoins(int coins){
        this.coins += coins;
    }

    public String getDirectionSymbol() {
        switch(this.direction){
            case 1: this.direction = DIRECTION_INDICATOR_UP;
                return DIRECTION_SYMBOL_UP;

            case 2: this.direction = DIRECTION_INDICATOR_RIGHT;
                return DIRECTION_SYMBOL_RIGHT;

            case 3: this.direction = DIRECTION_INDICATOR_DOWN;
                return DIRECTION_SYMBOL_DOWN;

            case 4: this.direction = DIRECTION_INICATOR_LEFT;
                return DIRECTION_SYMBOL_LEFT;
        }
        return "";

    }

    public int[] getPosition(){
        return this.position;
    }

    public int getRow(){
        return this.position[0];
    }

    public void setRow(int row){
        this.position[0] = row;
    }

    public int getColumn(){
        return this.position[1];
    }

    public void setColumn(int column){
        this.position[1] = column;
    }

}
