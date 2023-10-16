package org.howard.edu.lsp.assignment4;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set0 = new IntegerSet(null);
		set0.add(1);
		set0.add(2);
		set0.add(3);
		set0.add(4);
		set0.add(5);
		System.out.println("Set 0 is " + set0.toString());
		System.out.println("Set 0 length is " + set0.length());
		System.out.println("This smallest element in Set 0 is " + set0.smallest());
		System.out.println("\n");
		
		IntegerSet set1 = new IntegerSet(null);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		System.out.println("Set 1 is " + set1.toString());
		System.out.println("Set 1 length is " + set1.length());
		System.out.println("This largest element in Set 1 is " + set1.largest());
		System.out.println("\n");
		
		set1.diff(set0);
		System.out.println("The Difference Set 1 - Set 0 is " + set1.toString());
		System.out.println("\n");
		
		System.out.println("Clearing Sets...");
		set0.clear();
		set1.clear();
		System.out.println("Set 0 is now " + set0.toString() + ". Set 1 is now " + set1.toString() + ".");
		System.out.println("\n");
		
		System.out.println("Set 0 is empty? " + set0.isEmpty());
		System.out.println("Set 1 is empty? " + set1.isEmpty());
		System.out.println("\n");
		
		System.out.println("Restoring Sets...");
		set0.add(1);
		set0.add(2);
		set0.add(3);
		set0.add(4);
		set0.add(5);
		
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		System.out.println("Set 0 is now " + set0.toString() + ". Set 1 is now " + set1.toString() + ".");
		System.out.println("\n");
		
		set1.intersect(set0);
		System.out.println("The Intersection of Set 0 and Set 1 is " + set1.toString());
		System.out.println("\n");
		
	
		
		set0.clear();
		set1.clear();
		
		set0.add(1);
		set0.add(2);
		set0.add(3);
		set0.add(4);
		set0.add(5);
		
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		set0.union(set1);
		System.out.println("The Union of Set 0 and Set 1 is " + set0.toString());
		System.out.println("\n");
		
		
		set0.clear();
		set1.clear();
		
		set0.add(1);
		set0.add(2);
		set0.add(3);
		set0.add(4);
		set0.add(5);
		
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.complement(set0);
		System.out.println("Set 1's complement is " + set1.toString());
		System.out.println("\n");
		
		
		set0.clear();
		set1.clear();
		
		set0.add(1);
		set0.add(2);
		set0.add(3);
		set0.add(4);
		set0.add(5);
		
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.remove(5);
		System.out.println("Let's remove 5 from Set 1. Now Set 1 is " + set1.toString());
		
		System.out.println("\n");
		
		System.out.println("Set 1 contains 5? " + set1.contains(5));
		
		System.out.println("\n");
		
		System.out.println("Analysis Complete!");
	}

}
