package character.playing;

public abstract class Player {
    private String name;
    private int rupees;
    private int health;



    public Player(String name, int rupees, int health) {
        this.name = name;
        this.rupees = rupees;
        this.health = health;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getRupees() {
        return rupees;
    }

    public void setRupees(int rupees) {
        this.rupees = rupees;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int value){
        this.health -= value;
    }
}
