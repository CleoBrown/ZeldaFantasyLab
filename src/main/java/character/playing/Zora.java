package character.playing;

import character.moves.Weapon;

import java.util.ArrayList;

public class Zora extends Fighter {


    public Zora (String name, int rupees, int health, Weapon weapon){
        super (name, rupees, health, weapon);

    }

    public String swim() {
        return "I'm swimming";
    }

}
