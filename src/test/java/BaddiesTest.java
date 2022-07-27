import character.nonplaying.Baddies;
import character.nonplaying.NPCs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BaddiesTest {

    Baddies ganon;


    @Before
    public void before(){
        ganon = new Baddies("Ganon", 1000000,NPCs.GANON);
    }

    @Test
    public void baddyHasHealth(){
        assertEquals( 5000, ganon.getBaddyHealth());
    }


}
