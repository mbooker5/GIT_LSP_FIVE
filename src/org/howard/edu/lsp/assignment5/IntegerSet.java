package org.howard.edu.lsp.assignment5;

import java.util.List;
import java.util.ArrayList;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	
	public IntegerSet() {
		
	}
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
	 * Set union, saves result to Set a
	 * @param intSetb: set to unionize with
	 */
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			int num = intSetb.set.get(i);
			if(!this.set.contains(num)) {
				this.set.add(num);
			}
		}
	};

	/**
	 * intersect() method
	 * Set intersection, saves intersecting elements to s1 non-intersecting elements to s2
	 * @param intSetb: set to intersect
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> intersecting = new ArrayList<Integer>();
		IntegerSet nonIntersecting = new IntegerSet(null);
		for (int i = 0; i < this.set.size(); i++) {
			if (intSetb.contains(this.set.get(i))) {
				intersecting.add(this.set.get(i));
			} else {
				nonIntersecting.add(this.set.get(i));
			}
		}
		for (int j = 0; j < intSetb.length(); j++) {
			if (this.set.contains(intSetb.set.get(j)) && (!intersecting.contains(intSetb.set.get(j)))) {
				intersecting.add(intSetb.set.get(j));
			} else {
				nonIntersecting.add(intSetb.set.get(j));
			}
		}
		this.set = intersecting;
		intSetb = nonIntersecting;
		
	}; 
	
	/**
	 * diff() method
	 * // set difference, i.e. s1 - s2, stores result in s1
	 * @param intSetb: set to find difference for
	 */
	public void diff(IntegerSet intSetb) {
		for (int i = 0; i < this.set.size(); i++) {
			if (intSetb.contains(this.set.get(i))) {
				this.set.remove(i);
				i--;
			}
		}
	} 

	/**
	 * complement() method
	 * // Set complement, all elements not in s1, stores result in s1
	 * @param intSetb: set to find difference for
	 */
	public void complement(IntegerSet intSetb) {
		List<Integer> complement = new ArrayList<Integer>();
		for (int j = 0; j < intSetb.length(); j++) {
			if (!this.set.contains(intSetb.set.get(j))) {
				complement.add(intSetb.set.get(j));
			}
		}
		this.set = complement;
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
