package character;

public abstract class Player {
    private String name;
    private int rupees;



    public Player(String name, int rupees) {
        this.name = name;
        this.rupees = rupees;
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
}
