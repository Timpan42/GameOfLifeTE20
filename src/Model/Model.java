package Model;
import View.*;

import java.util.ArrayList;

public class Model {
    int x;
    int y;
    public Cell cell;
    public Model(int width, int height) {


        cell = new Cell(20,20,0,true);
    }

    public void update() {

    }

    public Shape[] getShapes() {
        Point[] points = {cell};
        return (Shape[])points;
    }

        }
