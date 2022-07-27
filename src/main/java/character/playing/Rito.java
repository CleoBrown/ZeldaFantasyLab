package character.playing;

import character.moves.Weapon;

import java.util.ArrayList;

public class Rito extends Fighter {


    public Rito (String name, int rupees, int health, ArrayList<Weapon> weapons, Weapon currentWeapon){
        super (name, rupees, health, weapons, currentWeapon);

    }

    public String fly() {
        return "I'm flying";
    }

}