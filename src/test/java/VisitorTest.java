import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Lady Ross",10, 146, 12.00);

    }

    @Test
    public void hasName(){assertEquals("Lady Ross", visitor.getName());}

    @Test
    public void hasAge() {
        assertEquals(10, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(146, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(12.00, visitor.getMoney(), 0.01);
    }

}
