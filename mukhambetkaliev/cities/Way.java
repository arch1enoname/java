package com.mukhambetkaliev.cities;

public class Way {
    private City start;
    private City end;

    public Way(City start, City end) {
        this.start = start;
        this.end = end;
        start.ways.add(this);
    }

    @Override
    public String toString() {
        return "com.mukhambetkaliev.cities.Way{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
