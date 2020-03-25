import carparts.Engine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Test
    public void hasEngine(){
        engine = new Engine("Hybrid");
        assertEquals("Hybrid", engine.getEngineType());
    }
}
