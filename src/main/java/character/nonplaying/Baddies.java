package character.nonplaying;
import character.playing.Player;

public class Baddies extends Player {

    private NPCs npcs;

    public Baddies(String name, int rupees, NPCs npcs) {
        super(name, rupees);
        this.npcs = npcs;
    }

    public String getBaddyType() {
        return this.npcs.getType();
    }

    public int getBaddyHealth() {
        return this.npcs.getHealth();
    }


    public void reduceHealth(int goodyDamage) {

    }

}
