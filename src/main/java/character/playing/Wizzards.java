package character.playing;
import character.Player;

public class Wizzards extends Player {

    String castSpells;
    String summonCreature;

    public Wizzards(String name, int rupees, String castSpells, String summonCreature) {
        super(name, rupees);
        this.castSpells = castSpells;
        this.summonCreature = summonCreature;
    }

    public String getCastSpells() {
        return castSpells;
    }

    public void setCastSpells(String castSpells) {
        this.castSpells = castSpells;
    }

    public String getSummonCreature() {
        return summonCreature;
    }

    public void setSummonCreature(String summonCreature) {
        this.summonCreature = summonCreature;
    }





}
