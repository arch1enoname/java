package com.mukhambetkaliev.geometry;

public class Square extends Figure implements getBrokenLineable{
    private final Point startPoint;
    private int sideLength;

    public Square(Point startPoint, int sideLength) {
        this (startPoint.x, startPoint.y, sideLength);
    }

    public Square(int x, int y, int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("<0");
        this.startPoint = new Point(x, y);
        this.sideLength = sideLength;
    }

    int getSideLength() {
        return sideLength;
    }

    public String toString() {
        return String.format("Квадрат в точке {%s, %s}, со стороной %s", startPoint.x, startPoint.y, sideLength);
    }

    void setSideLength(int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("<0");
        this.sideLength = sideLength;
    }
    public int getArea(){
        return sideLength*sideLength;
    }

    public BrokenLine getBrokenLine() {
        return new ClosedBrokenLine(startPoint, new Point(startPoint.x, startPoint.y+sideLength), new Point(startPoint.x+sideLength, startPoint.y+sideLength), new Point(startPoint.x+sideLength, startPoint.y));
    }
}
