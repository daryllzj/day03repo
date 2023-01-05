package sdf;

public class Link {

    private int hitpoint = 4;

    public int getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public void attack(Damagable damagable) {
        damagable.hit(hitpoint);
    }





}
