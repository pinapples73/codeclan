import carparts.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("re-treads");
    }

    @Test
    public void hasTyres(){
        assertEquals("re-treads", tyres.getTyreQuality());
    }

}
