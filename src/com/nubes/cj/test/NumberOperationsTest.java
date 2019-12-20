package com.nubes.cj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nubes.cj.exceptions.NumberOperations;

public class NumberOperationsTest {

	@Test
	public void divisionWithValidData() {
		assertEquals(4, NumberOperations.divide(20, 5));
	}
	
	@Test(expected=ArithmeticException.class)
	public void divisionWithValidException() {
		 NumberOperations.divide(20, 0);
	}
	
	

}
