public class Robot {
    private int posX;
    private int posY;
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

    public Robot(int posX, int posY, int direction, int coins){
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
        this.coins = coins;
    }

    //public boolean move(){}
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
    public boolean pick(Map map){}

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getCoins() {
        return coins;
    }

    public String getDirectionSymbol() {
        switch(this.direction){
            case 1: this.direction = DIRECTION_INDICATOR_UP;
                return DIRECTION_SYMBOL_UP;
                break;
            case 2: this.direction = DIRECTION_INDICATOR_RIGHT;
                return DIRECTION_SYMBOL_RIGHT;
                break;
            case 3: this.direction = DIRECTION_INDICATOR_DOWN;
                return DIRECTION_SYMBOL_DOWN;
                break;
            case 4: this.direction = DIRECTION_INICATOR_LEFT;
                return DIRECTION_SYMBOL_LEFT;
                break;
        }
        return "";

    }
}
