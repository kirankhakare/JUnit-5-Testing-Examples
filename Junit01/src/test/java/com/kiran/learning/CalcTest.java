package com.kiran.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		// System.out.println("This is my first test case example..");
		//assertEquals("Kiran","Kiran");
		Calc c = new Calc();
		int r=c.divide(10, 5);
		int expectedResult=2;
		assertEquals(expectedResult,r);
		System.out.println("Successfully Test the code..");
	}

}
