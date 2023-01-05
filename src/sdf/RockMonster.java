package sdf;

public class RockMonster extends Monster{


    public RockMonster() {
    }

    public RockMonster(int health) {
        this.health = health;
    }


    public void hit(int damage) {

        this.health -= damage * 0.5;
        
    }

    public boolean isDead() {
        return health <=0;
    }
    

    
}
