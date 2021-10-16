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
		//String with single number will return that number.
		assertEquals(1, stringCalculator.add("1"));
	}

}
