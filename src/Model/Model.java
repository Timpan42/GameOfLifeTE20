package Model;
import View.*;
import java.util.ArrayList;

public class Model {

    int width, height, alone, live, abundent;
    private int x;
    private int y;
    ArrayList<Point> points = new ArrayList<>();
    ArrayList<Point> cells = new ArrayList<>();


    public Model(int width, int height) {
        this.width = width;
        this.height = height;
        alone = 1;
        live = 3;
        abundent = 4;
        x++;
        y += 1;
        cells = points;

        points.add(new Point(5,5));
        points.add(new Point(6,5));
        points.add(new Point(7,5));
    }

    public void update() {
        rules();
        updateCells();
    }

    public Shape[] getShapes() {
        Point[] pixelsToDisplay = new Point[points.size()];
        points.toArray(pixelsToDisplay);
        return (Shape[])pixelsToDisplay;
    }

    public void updateCells(){
        Point[] cells = (Point[]) getShapes();
        cells[0].setX(x);
        cells[1].setY(y);
        cells[2].setX(15);

    }

    public void rules(){

    }
}
