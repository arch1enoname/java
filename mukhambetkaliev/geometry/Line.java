package com.mukhambetkaliev.geometry;

public class Line implements GetLengthable {
    Point start;
    Point end;

    public Line (Point start, Point end) {
        this(start.x, start.y, end.x, end.y);
    }

    public Line(int xStart, int yStart, int xEnd, int yEnd) {
        this.start = new Point(xStart, yStart);
        this.end = new Point(xEnd, yEnd);
    }

    public int getLength() {
        return (int) Math.sqrt((start.x-start.y)*(start.x-start.y) + (end.x - end.y)*(end.x - end.y));
    }

    public String toString() {
        return String.format("Линия от %s, до %s", start, end);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return line.start.equals(start) || line.end.equals(end);
    }

    @Override
    public Line clone()
    {
        return new Line(start, end);
    }


}