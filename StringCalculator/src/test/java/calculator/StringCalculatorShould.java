package test.java.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.calculator.StringCalculator;

public class StringCalculatorShould {

	@Test
	void emptyStringShouldReturn_0() {
		StringCalculator stringCalculator = new StringCalculator();
		// for empty string it will return 0
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void stringWithSingleNumberShouldReturnNumberAsInt() {
		StringCalculator stringCalculator = new StringCalculator();
		// String with single number will return that number.
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void stringWithTwoNumberCommaDelimterReturnNumberAsSum() {
		StringCalculator stringCalculator = new StringCalculator();
		// return sum of comma seperated numbers
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void stringWithUnknownNumberWithCommaDelimterReturnNumberAsSum() {
		StringCalculator stringCalculator = new StringCalculator();
		// Allow the Add method to handle an unknown amount of numbers
		assertEquals(10, stringCalculator.add("1,2,3,4"));
	}
	
	@Test
	void stringWithNewLinesAndCommBetweenNumbersAndReturnSum() {
		StringCalculator stringCalculator = new StringCalculator();
		// Allow the Add method to handle new lines between numbers (instead of commas)
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}	

}
