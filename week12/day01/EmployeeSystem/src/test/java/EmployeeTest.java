import staff.managment.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void before(){
        employee = new Manager("Big Boss Man", "ZZ112233A", 100000, "Savings");
    }

    @Test
    public void hasName(){
        assertEquals("Big Boss Man", employee.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("ZZ112233A", employee.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, employee.getSalary());
    }

    @Test
    public void testSetSalary(){
        employee.setSalary(110000);
        assertEquals(110000, employee.getSalary());
    }

    @Test
    public void testRaiseSalary(){
        employee.raiseSalary(5000);
        assertEquals(105000, employee.getSalary());
    }

    @Test
    public void testPayBonus(){
        assertEquals(1000, employee.payBonus(), 0.01);
    }
}
