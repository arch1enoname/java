package com.mukhambetkaliev.cat;

public class Meow {
    public static void meowAllMeowable(Meowable... meowables){
        for (Meowable meowable : meowables) {
            meowable.meow();
        }
    }
}
