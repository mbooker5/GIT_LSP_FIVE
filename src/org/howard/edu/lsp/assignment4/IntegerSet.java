package org.howard.edu.lsp.assignment4;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Constructor if you want to pass in already initialized
	 */
	public IntegerSet(ArrayList<Integer> set) {
		if (!(set == null)) {
			this.set = set;
		}
	}
	
	/**
	 * clear() method
	 * Clears the internal representation of the set
	 */
	public void clear() {
		this.set.clear();
	};

	
	/**
	 * length() method
	 * Returns the length of the set
	 */
	public int length() {
		return this.set.size();
	};

	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class.
	*/
	public boolean equals(List<Integer> o) {
		System.out.println("1");
		if (o instanceof IntegerSet) {
			System.out.println("2");
			for (int i = 0; i < this.set.size(); i++) {
				int num1 = o.get(i);
				int num2 = this.set.get(i);
				System.out.println("3");
				
				if (!(this.set.contains(num1) && (o.contains(num2)))){
					System.out.println("4");
					return false;
				}
			}
		} else {
			
			System.out.println(o.getClass().getName());
			return false;
		}
		System.out.println("6");
		return true;
	}; 

	
	/**
	 * contains() method
	 * @param value: integer to look for within set
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	};    

	/**
	 * largest() method
	 * @return the largest item in the set; Throws a IntegerSetException if the set is empty 
	 * @throws IntegerSetException if the set is empty.
	 */
	public int largest() throws IntegerSetException  {
		if (this.set.isEmpty()) {
			throw new IntegerSetException("This set is empty.");
		}
		int largest = this.set.get(0);	
		for (int i = 1; i < this.set.size(); i++) {
			if (this.set.get(i) > largest) {
				largest = this.set.get(i);
			}
		}
		
		return largest;
	}; 

	
	/**
	 *
	 * smallest() method
	 * @return the smallest item in the set; Throws a IntegerSetException if the set is empty 
	 * @throws IntegerSetException if the set is empty.
	 */
     public int smallest() throws IntegerSetException {
    	 if (this.set.isEmpty()) {
 			throw new IntegerSetException("This set is empty.");
 		}
 		int smallest = this.set.get(0);	
 		for (int i = 1; i < this.set.size(); i++) {
 			if (this.set.get(i) < smallest) {
 				smallest = this.set.get(i);
 			}
 		}
 		
 		return smallest;
     };
	
	
	/**
	 * add() method
	 * Adds an item to the set or does nothing it already there	
	 * @param item: item to be added to set
	 */
 	public void add(int item) {
 		if (!this.set.contains(item)) {
 			this.set.add(item);		
 		}
 	};
    
 	/**
	 * remove() method
	 * Removes an item from the set or does nothing if not there
	 * @param item: item to be removed from set
	 */ 
	public void remove(int item) {
		if (this.set.contains(item)) {
			int i = this.set.indexOf(item);
			this.set.remove(i);
		}

	}; 

	
	/**
	 * union() method
	 * Set union
	 * @param intSetb: set to unionize with
	 */
	public void union(IntegerSet intSetb) {};

	/**
	 * intersect() method
	 * Set intersection, all elements in s1 and s2
	 * @param intSetb: set to intersect
	 */
	public void intersect(IntegerSet intSetb) {}; 
	
	/**
	 * diff() method
	 * // set difference, i.e. s1 - s2
	 * @param intSetb: set to find difference for
	 */
	public void diff(IntegerSet intSetb) {
	} 

	/**
	 * complement() method
	 * // Set complement, all elements not in s1
	 * @param intSetb: set to find difference for
	 */
	public void complement(IntegerSet intSetb) {
	}

	/**
	 * isEmpty() method
	 * Checks if set is empty
	 * @return true if the set is empty, false otherwise
	 */
	boolean isEmpty() {
		return this.set.isEmpty();
	} 

	/**
	 * toString() method
	 * @return String representation of your set
	 */
	public String toString() {
		return this.set.toString();
	};


}
