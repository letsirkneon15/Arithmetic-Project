package com.IT7320.A3_PartB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticTest {
	
	private Arithmetic testObj;
	private int a, b, expected, actual;

	@Before
	public void setUp() throws Exception {
		a = 10; 
		b = 25;
		testObj = new Arithmetic(a,b);
		expected = 10+25;
		
		actual = testObj.add(a, b);
	}


	@Test
	public void testAdd() {
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() throws Exception {
		testObj=null;
	}


}
