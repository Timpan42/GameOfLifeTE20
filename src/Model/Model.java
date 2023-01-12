package Model;
import View.*;

import java.util.ArrayList;

public class Model {
    int x;
    int y;
    public Model(int width, int height) {

    }

    public void update() {
    }

    public Shape[] getShapes() {
        Point[] points = {new Point(10,10), new Point(11,10), new Point(11,11)};
        return (Shape[])points;
    }

        }
