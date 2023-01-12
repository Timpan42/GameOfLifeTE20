package Model;

public class Cell {
    private int cellX;
    private int cellY;
    boolean stateOfLife = true;
    int neighbor;

    public int getCellX() {
        return cellX;
    }

    public void setCellX(int cellX) {
        this.cellX = cellX;
    }

    public int getCellY() {
        return cellY;
    }

    public void setCellY(int cellY) {
        this.cellY = cellY;
    }

    public boolean isStateOfLife() {
        return stateOfLife;
    }


    public int getNeighbor() {
        return neighbor;
    }

}
