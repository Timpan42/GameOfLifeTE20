package Model;

import View.Point;

public class Cell extends Point {
    private boolean stateOfLife = true;
    private int neighbor;

    public Cell(int x, int y, int neighbor, boolean stateOfLife){
        super(x,y);
        this.neighbor = neighbor;
        this.stateOfLife = stateOfLife;
    }

    public boolean isStateOfLife() {
        return stateOfLife;
    }

    public int getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(int neighbor) {
        this.neighbor = neighbor;
    }

    }

