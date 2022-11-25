public class Rectangle extends Figure implements getBrokenLineable{
    Point point;
    int length;
    int width;

    @Override
    public int getArea() {
        return length*width;
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new ClosedBrokenLine(point, new Point(point.x, point.y+length), new Point(point.x+width, point.y), new Point(point.x+width, point.y+length));
    }
}
