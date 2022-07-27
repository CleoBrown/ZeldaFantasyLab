package character.playing;

import character.moves.Weapon;

import java.util.ArrayList;

public class Zora extends Fighter {


    public Zora (String name, int rupees, int health, ArrayList<Weapon> weapons, Weapon currentWeapon){
        super (name, rupees, health, weapons, currentWeapon);

    }

    public String swim() {
        return "I'm swimming";
    }

}
