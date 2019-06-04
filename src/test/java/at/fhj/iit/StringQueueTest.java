package at.fhj.iit;

import org.junit.*;
import static org.junit.Assert.*;

public class StringQueueTest {

    private StringQueue queueOne;
    private StringQueue queueTwo;

    @Before
    public void setUp() throws Exception
    {
        queueOne = new StringQueue();
        queueTwo = new StringQueue(0);
    }

    @Test
    public void testOffer()
    {
        queueOne.offer("test");
        queueOne.offer("test2");
        queueOne.offer("test3");
        assertTrue(queueOne.offer("test4"));
    }
    @Test
    public void testOffer2(){
        assertFalse(queueTwo.offer("blaaaaa"));
    }




}
