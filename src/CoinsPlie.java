public class CoinsPlie {
    private int [] position;
    private int quantity;

    public CoinsPlie(int row, int column, int quantity) {
        this.position = new int[2];
        this.position[0] = row;
        this.position[1] = column;
        this.quantity = quantity;
    }
    public int[] getPosition(){
        return this.position;
    }
//obtiene fila
    public int getRow(){
        return this.position[0];
    }
//obtiene la columna
    public int getColumn(){
        return this.position[1];
    }
//obtiene la cantidad de monedas
    public int getQuantity() {
        return quantity;
    }
//quita las monedas
    public void subtractCoins(int quantity) {
        this.quantity--;
    }
}
