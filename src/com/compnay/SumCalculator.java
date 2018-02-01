package com.compnay;

import java.math.BigInteger;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * 
 * @author Bhavin Mehta
 *
 */
public class SumCalculator {

	public static void main(String[] args) {

		SumCalculator sumCalculator = new SumCalculator();
		sumCalculator.calculateSumOfPreceedingNumber();
	}

	public void calculateSumOfPreceedingNumber() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("CalculateSumOfPreceedingNumber ");
		System.out.println("Please enter the numbe ");
		int number = scanner.nextInt();

		System.out.println("Please enter preceding number:");
		int precedingNumber = scanner.nextInt();
		BigInteger result = calculate(number, precedingNumber);
		System.out.println("Result is "+result);
	}
	
	public BigInteger calculate(int number, int precedingNumber) {
		BigInteger product = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		for (int i = 1; i < number; i++) {
			if (i <= precedingNumber) {
				product = product.multiply(new BigInteger("" + i));
			} else {
				product = product.multiply(new BigInteger("" + i)).divide(new BigInteger("" + (i - precedingNumber)));
			}
			sum = sum.add(product);
		}
		return sum;
	}

}
