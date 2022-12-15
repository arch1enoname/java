package com.mukhambetkaliev.geometry;

public class Circle extends Figure {
    int radius;
    Point point;

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}
