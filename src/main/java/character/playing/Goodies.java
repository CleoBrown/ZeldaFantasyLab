package character.playing;
import character.Player;
import character.moves.GoodyWeapons;
import character.nonplaying.Baddies;

public class Goodies extends Player   {
    private GoodyWeapons currentWeapon;

    private GoodyWeapons weapons;


    public Goodies(String name, int rupees, GoodyWeapons weapons, GoodyWeapons currentWeapon) {
        super(name, rupees);
        this.weapons = weapons;
        this.currentWeapon = currentWeapon;
    }

    public String getPlayerType() {
    }

    public int getPlayerHealth() {
    }

    public GoodyWeapons getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(GoodyWeapons currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public GoodyWeapons getWeapons() {
        return weapons;
    }

    public void setWeapons(GoodyWeapons weapons) {
        this.weapons = weapons;
    }

    public int getWeaponDamage(){
        return this.currentWeapon.getGoodyDamage();
    }

    public void attackEnemy(Baddies baddy){
        baddy.reduceHealth(this.currentWeapon.getGoodyDamage());
    }


}
