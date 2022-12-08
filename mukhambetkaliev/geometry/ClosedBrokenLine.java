package com.mukhambetkaliev.geometry;

import java.util.Arrays;

public class ClosedBrokenLine extends BrokenLine {

    public ClosedBrokenLine(Point... points){
        this.points = Arrays.asList(points);
    }

    public int getLength() {
        int length = super.getLength();
        length += Math.sqrt((points.get(points.size()-1).x - points.get(0).x) * (points.get(points.size()-1).x - points.get(0).x) + (points.get(points.size()-1).y - points.get(0).y) * (points.get(points.size()-1).y - points.get(0).y));
        return length;
    }
}
