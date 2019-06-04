package at.fhj.iit;
import org.unit.*;
import static org.unit.Assert.*;

public class StringQueueTest {

    private StringQueue queueOne;

    @Before
    public void setUp() throws Exception
    {
        queueOne = new StringQueue();
    }

    @Test
    public void testOffer(String obj)
    {
        queueOne.offer("test");
        queueOne.offer("test2");
        queueOne.offer("test3");
        assertTrue(queueOne.offer("test4"));
    }




}
