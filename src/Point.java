import java.util.*;

public class Point {

    private final double x;
    private final double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double radius){
        this.x = radius * Math.random();
        this.y = radius * Math.random();
    }

    // Returns true iff two points would be overlapping
    public boolean isOverlapping(Point other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2) ) <= 1;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

}
