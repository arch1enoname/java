package com.mukhambetkaliev.fraction;

public class SumClass {
    public static Number sum(Number... numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }
}
