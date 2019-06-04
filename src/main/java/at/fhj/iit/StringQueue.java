package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements Queue {
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	/**
	 * this. was missing and maxsize spelled wrong
	 * @param maxSize
	 */
	public StringQueue(int maxSize){
		this.maxSize = maxSize;
	}
	
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/**
	 *elementSize must be > 0
	 * @return first added element
	 */
	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() > 0){
			elements.remove(0);
		}
		
		return element;
	}

	/**
	 * String is empty if was always true
	 * removed the empty String
	 * @return first element in array
	 */
	@Override
	public String remove() {
		String element = poll();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}