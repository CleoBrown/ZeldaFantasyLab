package character.moves;


public enum Weapon {

    MASTERSWORD(150),
    RAPIER(200),
    ICEROD(100),
    BRANCH(1),
    DAKULEAF(5),
    ;

    private int damage;


    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }



}
