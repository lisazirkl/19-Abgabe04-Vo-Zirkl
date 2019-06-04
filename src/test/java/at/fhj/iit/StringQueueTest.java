package at.fhj.iit;

import org.junit.*;
import org.junit.rules.ExpectedException;
import java.util.NoSuchElementException;

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

    @Test
    public void testPoll(){
        queueOne.offer("test");
        queueOne.offer("test2");
        queueOne.offer("test3");
        assertEquals("test",queueOne.poll());

    }

    @Test
    public void testRemove(){
        queueOne.offer("test");
        queueOne.offer("test2");
        queueOne.offer("test3");
        assertEquals("test",queueOne.poll());
    }

    @Test (expected = NoSuchElementException.class)
    public void testRemove2(){
        queueOne.remove();
    }

    @Test
    public void testPeek()
    {
        queueOne.offer("test");
        queueOne.offer("test2");
        assertEquals("test", queueOne.peek());
        queueOne.remove();
        assertEquals("test2", queueOne.peek());
    }






}
