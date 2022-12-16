package Model;
import View.*;

import java.util.ArrayList;

public class Model {
    int x;
    int y;
    ArrayList<Integer> Points = new ArrayList<>();
    public Model(int width, int height) {

    }

    public void update() {
        getRules();
    }

    public Shape[] getShapes() {
        Points = {new Point(10,10), new Point(11,10), new Point(11,11)};
        return (Shape[])Points;
    }

    public void getRules(){
        for (int i = 0; i < Points.size(); i++) {
            for (int j = 0; j < Points.size(); j++) {
                if (Point[i] == Point[j]){
                    //don't move
                }
                if(){
                    // if alone dies
                }
                if(){
                    //if four cells dies
                }
                if(){
                    //if have one or two neighbor liv
                }
            }


        }
    }
}
