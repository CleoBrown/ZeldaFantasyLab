package character.playing;

import character.moves.Weapon;

import java.util.ArrayList;

public class Hylian extends Fighter {


public Hylian (String name, int rupees, int health, ArrayList<Weapon> weapons, Weapon currentWeapon){
   super (name, rupees, health, weapons, currentWeapon);

}

    public String rideHorse() {
        return "I'm on a horse";
    }

}
