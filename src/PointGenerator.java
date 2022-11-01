import java.util.*;

public class PointGenerator {

    // Contains all the points, the first half are red and the second half are green
    private List<Point> points;
    private final int NUM_TESTS = 5;

    public static void main(String[] args){
        // This is the number of points for each red and green
        for(int i = 1; i <= 10; i++){
            System.out.println("Set " + i);
            PointGenerator main = new PointGenerator(i);
            main.printByColor(false);
            System.out.println();
        }
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

    public PointGenerator(List<Point> points){
        this.points = points;
    }

    // This is a toString that allows for a randomized time
    public String toString(boolean includeTime){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(Point point : this.points){
            stringBuilder.append(point.toString(includeTime) );
            stringBuilder.append(',');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public String toString(){
        return this.toString(false);
    }

    public void printByColor(boolean includeTime){
        System.out.print("c_{ir}\\left(");
        System.out.print( (new PointGenerator(this.points.subList(0, this.points.size() / 2) ) ).toString(includeTime) );
        System.out.println("\\right)\\le0");
        System.out.print("c_{ir}\\left(");
        System.out.print( (new PointGenerator(this.points.subList(this.points.size() / 2, this.points.size() ) ) ).toString(includeTime) );
        System.out.println("\\right)\\le0");
    }

}
