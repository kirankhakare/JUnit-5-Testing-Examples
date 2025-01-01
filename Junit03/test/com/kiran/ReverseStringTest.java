package com.kiran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse =new ReverseString();
		
		assertEquals("nariK",reverse.reverseString("Kiran"));
		assertEquals("neilA",reverse.reverseString("Alien"));
	}

}
