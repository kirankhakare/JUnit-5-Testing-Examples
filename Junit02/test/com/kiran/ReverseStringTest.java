package com.kiran;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString r = new ReverseString();
		String actual = r.reverseString("Shra");
		
		String expected ="arhS";
		
		assertEquals(expected,actual);
	}

}
