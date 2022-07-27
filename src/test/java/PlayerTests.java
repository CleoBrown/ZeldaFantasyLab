import character.moves.Weapon;
import character.playing.Hylian;
import character.playing.Rito;
import character.playing.Zora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTests {

    Hylian link;
    Hylian zelda;

    Rito revali;

    Zora mipha;




    @Before
    public void before(){
        link = new Hylian("Link",100, 70, Weapon.MASTERSWORD);
        zelda = new Hylian("Zelda", 200, 80, Weapon.RAPIER );
        revali = new Rito("Revali", 500, 80, Weapon.DAKULEAF);
    }

    @Test
    public void canGetName(){
        assertEquals("Link", link.getName());}

    @Test
    public void hylianCanRideHorse(){
        assertEquals ("I'm on a horse", zelda.rideHorse());
    }

    @Test
    public void ritoCanFly(){
        assertEquals ("I'm flying", revali.fly());

    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(200, zelda.getWeaponDamage());
    }


}
