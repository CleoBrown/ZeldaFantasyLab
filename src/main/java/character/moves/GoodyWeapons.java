package character.moves;


public enum GoodyWeapons {

    MASTERSWORD(150),
    RAPIER(200),
    ICEROD(100),
    BRANCH(1),
    DAKULEAF(5),
    ;

    private int goodyDamage;


    GoodyWeapons(int goodyDamage) {
        this.goodyDamage = goodyDamage;
    }

    public int getGoodyDamage() {
        return goodyDamage;
    }



}
