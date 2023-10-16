package org.howard.edu.lsp.assignment4;

public class Driver {

	public static void main(String[] args) {
		IntegerSet set0 = new IntegerSet(null);
		set0.add(2);
		set0.add(4);
		set0.add(6);
		System.out.println(set0.toString());
		
		IntegerSet set1 = new IntegerSet(null);
		set1.add(2);
		set1.add(4);
		set1.add(6);
		System.out.println(set1.toString());
		
		System.out.println(set1.equals(set0));

	}

}
