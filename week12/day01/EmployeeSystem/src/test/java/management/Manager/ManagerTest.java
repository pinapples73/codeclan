import org.junit.Before;
import org.junit.Test;
import staff.managment.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    public Manager manager;


    @Before
    public void before(){
        manager = new Manager("Big Boss Man", "ZZ112233A", 100000, "Savings");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Savings", manager.getDeptName());
    }

}
