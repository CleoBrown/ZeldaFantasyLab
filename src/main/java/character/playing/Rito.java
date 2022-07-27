package character.playing;

import character.moves.Weapon;

import java.util.ArrayList;

public class Rito extends Fighter {


    public Rito (String name, int rupees, int health,  Weapon weapon){
        super (name, rupees, health, weapon);

    }

    public String fly() {
        return "I'm flying";
    }

}