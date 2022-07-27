package character.playing;

public enum PCs {

    LINK("Hylian", 100),
    ZELDA("Hylian", 150),
    KINGRHOAM("Hylian", 200),
    WIZZROBES("Wizards", 150),
    KOROKS("Warlocks", 250),
    FAIRY("Healers", 500);


    private String type;
    private int health;

    PCs(String type, int health) {
        this.type = type;
        this.health = health;
    }

    public String getPlayerType() {
        return type;
    }

    public int getHealth() {
        return health;
    }



}
