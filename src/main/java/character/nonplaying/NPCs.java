package character.nonplaying;

public enum NPCs {

    BOKOBLINS("Goblinoid",50),
    MOBLINS("Goblinoid", 60),
    LIZALFOS("Lizards", 70),
    GANON("Demonic Beast", 5000);

    private String type;
    private int health;

    NPCs(String type, int health) {
        this.type = type;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

}
