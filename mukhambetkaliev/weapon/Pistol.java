package com.mukhambetkaliev.weapon;

public class Pistol extends Weapon{
    final int maxBullets;

    public Pistol(int maxBullets) {
        if (maxBullets < 1) throw new IllegalArgumentException();
        this.maxBullets = maxBullets;
    }

    public int reload(int n) {
        if (bullets + n > maxBullets) {
            bullets = maxBullets;
            return bullets + n - maxBullets;
        } else {
            bullets += n;
            return 0;
        }
    }

    public int unload() {
        int x = bullets;
        bullets = 0;
        return x;
    }

    public int getAmountOfBullets() {
        return bullets;
    }

    public boolean isLoad() {
        return bullets != 0;
    }

    public void shoot() {
        if (bullets > 0) {
            System.out.println("Бах!");
            bullets--;
        } else {
            System.out.println("Клац!");
        }
    }
}
