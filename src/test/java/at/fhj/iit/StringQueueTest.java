package at.fhj.iit;

import org.junit.*;
import org.junit.rules.ExpectedException;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StringQueueTest {

    private StringQueue queueOne;
    private StringQueue queueTwo;


    /**
     * setUp for testing
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception
    {
        queueOne = new StringQueue();
        queueTwo = new StringQueue(0);
    }

    /**
     * First test for offer method
     * @result must be true
     */
    @Test
    public void testOffer()
    {
        queueOne.offer("test");
        queueOne.offer("test2");
        queueOne.offer("test3");
        assertTrue(queueOne.offer("test4"));
    }

    /**
     * Second test for offer method
     * @result must be false
     */
    @Test
    public void testOffer2(){
        assertFalse(queueTwo.offer("blaaaaa"));
    }

    /**
     * test poll method adding 3 Strings
     * @result must be the first added String
     */
    @Test
    public void testPoll(){
        queueOne.offer("test");
        queueOne.offer("test2");
        queueOne.offer("test3");
        assertEquals("test",queueOne.poll());

    }

    /**
     * test remove method
     *remove the first added String
     * @result must be the removed String
     */
    @Test
    public void testRemove(){
        queueOne.offer("test");
        queueOne.offer("test2");
        queueOne.offer("test3");
        assertEquals("test",queueOne.poll());
    }

    /**
     * test Exception
     */
    @Test (expected = NoSuchElementException.class)
    public void testRemove2(){
        queueOne.remove();
    }

    /**
     * test peek method
     */
    @Test
    public void testPeek()
    {
        queueOne.offer("test");
        queueOne.offer("test2");
        assertEquals("test", queueOne.peek());
        queueOne.remove();
        assertEquals("test2", queueOne.peek());
    }

    /**
     * test Exception
     */
    @Test (expected = NoSuchElementException.class)
    public void testElement(){
        queueOne.offer("test");
        queueOne.remove();
        queueOne.element();
    }

    /**
     * test element
     */
    @Test
    public void testElement2(){
        queueOne.offer("hallo");
        queueOne.offer("ich");
        assertEquals("hallo",queueOne.element());
    }






}
