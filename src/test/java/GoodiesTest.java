import character.moves.GoodyWeapons;
import character.playing.Goodies;
import org.junit.Before;
import character.playing.PCs;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodiesTest {

    Goodies link;
    Goodies zelda;


    @Before
    public void before(){
        link = new Goodies("Link",100, GoodyWeapons.MASTERSWORD, PCs.LINK);
        zelda = new Goodies("Zelda", 200, GoodyWeapons.RAPIER, PCs.ZELDA );
    }

    @Test
    public void canGetName(){
        assertEquals("Link", link.getName());
    }

    @Test
    public void characterHasType(){
        assertEquals("Hylian", link.getPlayerType());
    }

    @Test
    public void characterHasHealth(){
        assertEquals(150, zelda.getPlayerHealth());
    }

    @Test
    public void characterCanDoDamage(){
        assertEquals(150, link.getWeaponDamage());

    }


}
