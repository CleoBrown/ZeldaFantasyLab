package character.playing;

import character.moves.Weapon;

import java.util.ArrayList;

public class Hylian extends Fighter {


public Hylian (String name, int rupees, int health, Weapon weapon){
   super(name, rupees, health, weapon);
}

    public String rideHorse() {
        return "i'm on a horse";
    }

}
