import carparts.Lights;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightsTest {

    private Lights lights;

    @Test
    public void testLightType(){
        lights = new Lights("Halogen");
        assertEquals("Halogen", lights.getLightType());
    }
}
