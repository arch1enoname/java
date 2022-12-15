package com.mukhambetkaliev.cities;

public class BackWay extends Way{
    public BackWay(City start, City end) {
        super(start, end);
        end.addWay(new Way(end, start));
    }
}
