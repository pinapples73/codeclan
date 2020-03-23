import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person person;

    @Before
    public void before(){
        person = new Person("John", "G17");
    }

    @Test
    public void hasName(){
        assertEquals("John", person.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G17", person.getCohort());
    }

    @Test
    public void canChangeCohort(){
        person.setCohort("G18");
        assertEquals("G18", person.getCohort());
    }

    @Test
    public void canChangeName(){
        person.setName("Peter");
        assertEquals("Peter", person.getName());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", person.talk("Java"));
    }

}
