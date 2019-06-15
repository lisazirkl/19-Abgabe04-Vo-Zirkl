package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * The StringQueue class creates an ArrayList of Strings which represents a Queue.
 * @author Cong Thanh Nhan Vo
 * @author Lisa Zirkl
 */
public class StringQueue implements Queue {

	private static final Logger logger = LogManager.getLogger(StringQueue.class);
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	/**
	 * this. was missing and maxsize spelled wrong
	 * maximum of 5 Strings could be stored in this Arraylist
	 * @param maxSize
	 */
	public StringQueue(int maxSize){

		this.maxSize = maxSize;
	}

	/**
	 * default constructor
	 */
	public StringQueue(){

	}

	/**
	 * add a new String to Arraylist
	 * @param obj new String
	 * @return true if there is space in Arraylist elements<maxSize
	 */
	@Override
	public boolean offer(String obj) {
		logger.info("added");
		if(elements.size()!= maxSize)
			elements.add(obj);
		else {
			logger.info("no space");
			return false;
		}
		return true;
	}

	/**
	 *elementSize must be > 0
	 * @return first added element
	 */
	@Override
	public String poll() {
		logger.info("poll");
		String element = peek();
		
		if(elements.size() > 0){
			elements.remove(0);
		}
		
		return element;
	}

	/**
	 * String is empty if was always true
	 * removed the empty String
	 * @return first element in ArrayList
	 */
	@Override
	public String remove() {
		logger.info("removed");
		String element = poll();
		if(element == null) {
			logger.info("no element anymore");
			throw new NoSuchElementException("there's no element any more");
		}

		return element;
	}

    /**
     * checks if elements is > 0
     * @return first element from ArrayList
     */
	@Override
	public String peek() {
		logger.info("peek");
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

    /**
     * throws an exception if ArrayList is empty
     * @return first element from ArrayList
     */
	@Override
	public String element() {
		logger.info("element");
		String element = peek();
		if(element == null) {
			logger.info("no element");
			throw new NoSuchElementException("there's no element any more");
		}
		return element;
	}

	public static void main(String[] args) {

		StringQueue test = new StringQueue(4);

		test.offer("Hallo");
		test.offer("ich");
		test.offer("teste");
		test.remove();
		test.peek();
		test.element();
		test.remove();
		test.remove();
		test.element();


	}

}