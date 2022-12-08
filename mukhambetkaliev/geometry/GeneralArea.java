package com.mukhambetkaliev.geometry;

public class GeneralArea {
    public static int sumArea(Figure... figures){
        int sum = 0;
        for(Figure figure : figures) {
            sum += figure.getArea();
        }
        return sum;
    }
}
