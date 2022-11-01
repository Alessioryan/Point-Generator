import java.util.*;

public class PointGenerator {

    // Contains all the points, the first half are red and the second half are green
    private List<Point> points;
    private final int NUM_TESTS = 5;


    public static void main(String[] args){
        // This is the number of points for each red and green
        PointGenerator main = new PointGenerator(1);
        System.out.println(main.toString() );
    }


    public PointGenerator(int numPoints){
        this.points = new ArrayList<>();
        this.points.add(new Point() );

        Point testPoint;
        PointSearch:
        while(this.points.size() != 2 * numPoints){
            testPoint = new Point(numPoints + 1);
            for(Point point : this.points){
                if(point.isOverlapping(testPoint) ){
                    continue PointSearch;
                }
            }
            this.points.add(testPoint);
        }
    }


    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(Point point : this.points){
            stringBuilder.append(point.toString() );
            stringBuilder.append(',');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }


}
