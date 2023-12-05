package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	private IntegerSet set0;
	private IntegerSet set1;
	private IntegerSet set2;
	private IntegerSet set3;
	
	@BeforeEach
	void setUp() {
		set0 = new IntegerSet();
		
		set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set2 = new IntegerSet();
		set2.clear();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		set3 = new IntegerSet();
		set3.clear();
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);
		set3.add(8);

	}
	
	@Test
	@DisplayName("test clear")
	public void testClear() {
		set1.clear();
		assertTrue(set1.isEmpty() == true);
		assertTrue(set2.isEmpty() == false);
	}
	
	@Test
	@DisplayName("test length")
	public void testLength() {
		assertEquals(set0.length(), 0);
		assertEquals(set1.length(), 5);
		assertEquals(set2.length(), 6);
	}
	
	@Test
	@DisplayName("test equals")
	public void testEquals() {
		assertTrue(set1.equals(set2) == false);
		assertTrue(set2.equals(set3) == true);
	}
	
	@Test
	@DisplayName("test contains")
	public void testContains() {
		assertEquals(set1.contains(3), true);
		assertEquals(set2.contains(9), false);
	}
	
	@Test
	@DisplayName("test largest")
	public void testLargest() throws IntegerSetException {
		assertEquals(set1.largest(), 5);
		assertEquals(set2.largest(), 8);
	}
	
	@Test
	@DisplayName ("test largest exception")
	public void testLargestException() throws IntegerSetException {
		Throwable exception = assertThrows(IntegerSetException.class, () -> set0.largest());
		assertNotNull(exception.getMessage());
		assertEquals("This set is empty.", exception.getMessage());
	}
	
	@Test
	@DisplayName("test smallest")
	public void testSmallest() throws IntegerSetException {
		assertEquals(set1.smallest(), 1);
		assertEquals(set2.smallest(), 3);
	}
	
	@Test
	@DisplayName ("test smallest exception")
	public void testSmallestException() throws IntegerSetException {
		Throwable exception = assertThrows(IntegerSetException.class, () -> set0.smallest());
		assertNotNull(exception.getMessage());
		assertEquals("This set is empty.", exception.getMessage());
	}
	
	@Test
	@DisplayName("test add")
	public void testAdd() {
		set0.add(0);
        set1.add(5);
		assertEquals(set0.toString(), "[0]");
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
	}
	
	@Test
	@DisplayName("test remove")
	public void testRemove() {
		set0.remove(0);
        set1.remove(3);
		assertEquals(set0.toString(), "[]");
		assertEquals(set1.toString(), "[1, 2, 4, 5]");
	}
	
	@Test
	@DisplayName("test union")
	public void testUnion() {
		set1.union(set2);
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5, 6, 7, 8]");
		
		set0.union(set3);
		assertEquals(set0.toString(), "[3, 4, 5, 6, 7, 8]");
	}
	
	@Test
	@DisplayName("test intersect")
	public void testIntersect() {
		set1.intersect(set2);
		assertEquals(set1.toString(), "[3, 4, 5]");
		
        set0.intersect(set1);
		assertEquals(set0.toString(), "[]");
		
		set2.intersect(set3);
		assertEquals(set2.toString(), "[3, 4, 5, 6, 7, 8]");
	}
	
	@Test
	@DisplayName("test difference")
	public void testDiff() {
		set1.diff(set2);
		assertEquals(set1.toString(), "[1, 2]");
		
        set1.diff(set0);
		assertEquals(set1.toString(), "[1, 2]");
		
		set2.diff(set3);
		assertEquals(set2.toString(), "[]");
	}
	
	@Test
	@DisplayName("test complement")
	public void testComplement() {
		set1.complement(set2);
		assertEquals(set1.toString(), "[6, 7, 8]");
		
        set0.complement(set3);
		assertEquals(set0.toString(), "[3, 4, 5, 6, 7, 8]");
	}
	
	@Test
	@DisplayName("test isEmpty")
	public void testIsEmpty() {
		assertTrue(set0.isEmpty() == true);
		assertTrue(set1.isEmpty() == false);
		
	}
	
	@Test
	@DisplayName("test toString")
	public void testToString() {
		assertEquals(set0.toString(), "[]");
		assertEquals(set1.toString(), "[1, 2, 3, 4, 5]");
		
	}
	

}
