package Model;
import View.*;
import java.util.ArrayList;

public class Model {

    int width, height, alone, live, abundent;
    private int x;
    private int y;
    ArrayList<Point> curentCells = new ArrayList<>();
    ArrayList<Point> nextCells = new ArrayList<>();


    public Model(int width, int height) {
        this.width = width;
        this.height = height;
        alone = 1;
        live = 3;
        abundent = 4;
        x++;
        y += 1;
        nextCells = curentCells;

        curentCells.add(new Point(5,5));
        curentCells.add(new Point(6,5));
        curentCells.add(new Point(7,5));
    }

    public void update() {
        nextCells = curentCells;
        rules();
        updateCells();
        curentCells = nextCells;
    }

    public void updateCells(){
        Point[] cells = (Point[]) getShapes();
        Point[] next = new Point[nextCells.size()];
        next = nextCells.toArray(next);
        int neighber;
        int x;
        int y;

        for (int i = 0; i < getShapes().length; i++) {
                x = 1;

            for (int j = 0; j < ; j++) {
                
            }
            /*
            next[i].setX(x+1);
            next[i].setY(x+1);

            cells[i] = next[i];

             */
        }
    }

    public void rules(){

    }

    //klar
    public Shape[] getShapes() {
        Point[] pixelsToDisplay = new Point[curentCells.size()];
        curentCells.toArray(pixelsToDisplay);
        return (Shape[])pixelsToDisplay;
    }
}
