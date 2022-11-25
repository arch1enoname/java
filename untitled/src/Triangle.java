public class Triangle extends Figure implements getBrokenLineable{
    Point point1;
    Point point2;
    Point point3;

    @Override
    public int getArea() {
        return (((point2.x - point1.x)*(point3.y - point1.y)) - ((point3.x - point1.x)*(point2.y-point1.y)))/2;
    }

    public BrokenLine getBrokenLine(){
        return new ClosedBrokenLine(point1, point2, point3);
    }
}
