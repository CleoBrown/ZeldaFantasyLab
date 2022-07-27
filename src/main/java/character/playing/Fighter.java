package character.playing;
import character.moves.Weapon;
import character.nonplaying.Baddies;

import java.util.ArrayList;

public abstract class Fighter extends Player   {

    private Weapon weapon;


    public Fighter(String name, int rupees, int health, Weapon weapon) {
        super(name, rupees, health);
        this.weapon = weapon;
    }


    public Weapon getCurrentWeapon() {
        return weapon;
    }



    public int getWeaponDamage(){
        return this.weapon.getDamage();
    }

    public void attack(Baddies baddy){
        baddy.reduceHealth(this.weapon.getDamage());
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }


}
