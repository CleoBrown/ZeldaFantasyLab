package character.playing;
import character.moves.Weapon;
import character.nonplaying.Baddies;

import java.util.ArrayList;

public abstract class Fighter extends Player   {

    private Weapon currentWeapon;
    private ArrayList<Weapon> weapons;

    public Fighter(String name, int rupees, int health, ArrayList<Weapon> weapons, Weapon currentWeapon) {
        super(name, rupees, health);
        this.weapons = weapons;
        this.currentWeapon = currentWeapon;
    }



    public int getHealth() {
    }


    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public int getWeaponDamage(){
        return this.currentWeapon.getDamage();
    }

    public void attack(Baddies baddy){
        baddy.reduceHealth(this.currentWeapon.getDamage());
    }


}
