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

    public void rules(){
        Point[] cells = (Point[]) getShapes();
        Point[] next = new Point[nextCells.size()];
        next = nextCells.toArray(next);
        ArrayList<Integer> neighber = new ArrayList<>();

        for (int i = 0; i < getShapes().length; i++) {
            int count = 0;
            int x = cells[i].getX();
            int y = cells[i].getY();
            // kollar om cell i har en granne från -1 till 1 i Y led
            for (int dy = -1; dy <= 1; dy++) {
                // kollar om cell i har en granne från -1 till 1 i X led
                for (int dx = -1; dx <= 1; dx++) {
                    int nx = x + dx;
                    int ny = y + dy;
                    for (int j = 0; j < cells.length; j++) {
                        if (cells[j].getY() == ny && cells[j].getX() == nx) {
                            count++;
                        }
                    }
                }
            }

            // spara count för cellen


/*            int nX = cells[i+1].getX();
            int nY = cells[i+1].getY();
                if(x+1 == nX  || x-1 == nX || y+1 == nY || y-1 == nY)
                {
                    neighber.add();
                }
        */
        }
    }

    public void updateCells(){

    }

    //klar
    public Shape[] getShapes() {
        Point[] pixelsToDisplay = new Point[curentCells.size()];
        curentCells.toArray(pixelsToDisplay);
        return (Shape[])pixelsToDisplay;
    }
}
