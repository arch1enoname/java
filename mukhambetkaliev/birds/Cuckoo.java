package com.mukhambetkaliev.birds;

public class Cuckoo extends Bird {
    @Override
    public void sing() {
        for (int i = 0; i < Math.random()*10; i++) {
            System.out.print("ку ");
        }
    }
}
