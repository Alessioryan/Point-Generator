import java.util.*;

public class Point {

    private final double x;
    private final double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double radius){
        this.x = 2 * radius * (Math.random() - 0.5);
        this.y = 2 * radius * (Math.random() - 0.5);
    }

    // Returns true iff two points would be overlapping
    public boolean isOverlapping(Point other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2) ) <= 2;
    }

    @Override
    public String toString(){
        return this.toString(false);
    }

    public String toString(boolean includeTime){
        StringBuilder sb = new StringBuilder();
        sb.append("(" + this.x);
        if(includeTime){
            sb.append("+\\sin\\left(t_{1}+");
            sb.append(2 * Math.PI * Math.random() );
            sb.append("\\right)");
        }
        sb.append("," + this.y);
        if(includeTime){
            sb.append("+\\sin\\left(t_{1}+");
            sb.append(2 * Math.PI * Math.random() );
            sb.append("\\right)");
        }
        sb.append(")");
        return sb.toString();
    }

}
