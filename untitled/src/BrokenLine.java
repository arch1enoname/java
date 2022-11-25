import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine implements GetLengthable{
    List<Point> points = new ArrayList<>();

    public BrokenLine(){}

    public BrokenLine(Point... points){
        this.points = Arrays.asList(points);
    }

    public void addPoints(Point... points){
        this.points.addAll(Arrays.asList(points));
    }

    public int getLength() {
        int length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += Math.sqrt((points.get(i).x - points.get(i-1).x) * (points.get(i).x - points.get(i-1).x) + (points.get(i).y - points.get(i-1).y) * (points.get(i).y - points.get(i-1).y));
        }
        return length;
    }

    public String toString() {
        return String.format("Линия %s", points.toString());
    }

}
