package com.compnay;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

/**
 * 
 * @author Bhavin Mehta
 *
 */
public class SumCalculatorTest {

	@Test
	public void calculateSum(){
		SumCalculator sumCalculator = new SumCalculator();
		BigInteger result = sumCalculator.calculate(100, 10);
		assertEquals(result,new BigInteger("513946235090696089113"));
	}
}
