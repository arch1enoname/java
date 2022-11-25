public class Automatic extends Pistol {

    private int rateOfFire;

    public Automatic(){
        super(30);
        this.rateOfFire = 30;
    }

    public Automatic(int maxBullets) {
        super(maxBullets);
    }

    public Automatic(int maxBullets, int rateOfFire) {
        this(maxBullets);
        this.rateOfFire = rateOfFire;
    }

    public void shoot() {
        for (int i = 0; i < rateOfFire; i++) {
            super.shoot();
        }
    }

    public void shootNTime(int n){
        for (int i = 0; i < n; i++) {
            shoot();
        }
    }
}
