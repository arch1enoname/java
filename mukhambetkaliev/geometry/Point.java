package com.mukhambetkaliev.geometry;

import com.mukhambetkaliev.fraction.Fraction;

public class Point implements Cloneable{
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return point.y == this.y || point.x == this.x;
    }

    @Override
    public Point clone() {
        try {
            Point point = (Point) super.clone();
            point.x = x;
            point.y = y;
            return point;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
