package org.howard.edu.lsp.midterm.problem2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Range range1 = new Range(5, 10);
		Range range2 = new Range(8, 15);
		Range range3 = new Range(17, 10);
		int testValue = 7;
		System.out.println("Is " + testValue + " in range 1? "  + range1.isValueInRange(testValue));
		System.out.println("Is " + testValue + " in range 2? "  + range2.isValueInRange(testValue));
		System.out.println("Do range1 and range2 overlap? " + range1.doRangesOverlap(range2));
		System.out.println("Do range1 and range3 overlap? " + range1.doRangesOverlap(range3));
		System.out.println("Do range2 and range3 overlap? " + range2.doRangesOverlap(range3));
		System.out.println("Size of range1: " + range1.size() + " -> 5, 6, 7, 8, 9.");
	    }


}
