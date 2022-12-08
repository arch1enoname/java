package com.mukhambetkaliev.weapon;

abstract class Weapon {
    int bullets;
    public int reload(int n) {return 0;}
    public int unload() {return 0;}
    public int getAmountOfBullets() {return 0;}
    public boolean isLoad(){return true;}
    public void shoot(){}
}
