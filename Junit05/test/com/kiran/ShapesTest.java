package com.kiran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class ShapesTest {

	@BeforeEach
	void init() {
		Shapes shape = new Shapes();
		System.out.println("Before test");
	}
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all test");
	}@AfterAll
	static void AfterAll() {
		System.out.println("After all test");
	}
	@Test
	void testcomputeSquareArea()
	{
		Shapes shape = new Shapes();
		
		//assertEquals(576,shape.computeSquareArea(24),"Wrong Answer");
		assertNotEquals(577,shape.computeSquareArea(24),"Wrong Answer");
	}
	@Test
	void test() {
		String str="Kiran";
		assertTrue(str.equals("Kiran"));
	}
	@Test
	void testArrays()
	{
		int []expected= {2,4,6,8};
		int []actual= {4,8,6,2};
		
		Arrays.sort(actual);
		
		assertArrayEquals(expected,actual);
	}
	
	@AfterEach
	void destroy() {
		System.out.println("After test clean up...");
	}
}
