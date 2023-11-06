package org.howard.edu.lsp.assignment5;

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
		assertTrue(set1.contains(3) == true);
		assertTrue(set2.contains(8) == false);
	}
	
	@Test
	@DisplayName("test largest")
	public void testLargest() throws IntegerSetException {
		assertEquals(set1.largest(), 5);
		assertEquals(set2.largest(), 8);
	}
	
	@Test
	@DisplayName("test smallest")
	public void testSmallest() throws IntegerSetException {
		assertEquals(set1.smallest(), 1);
		assertEquals(set2.smallest(), 3);
	}
	
	@Test
	@DisplayName("test add")
	public void testAdd() {
		assertTrue(set1.contains(3) == true);
		assertTrue(set2.contains(8) == false);
	}
	
	
	
}
