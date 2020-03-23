import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dba;

    @Before
    public void before(){
        dba = new DatabaseAdmin("DB Lover", "NZ01", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("DB Lover", dba.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("NZ01", dba.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, dba.getSalary());
    }
}

