package com.mukhambetkaliev.student;

public class Rule implements Rulable{
    public boolean checkRule(int i) {
        return (i <= 5 && i >= 2);
    }
}
