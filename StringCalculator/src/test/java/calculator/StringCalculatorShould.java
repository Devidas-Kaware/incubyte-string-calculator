package test.java.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.calculator.StringCalculator;

public class StringCalculatorShould {
	@Test
	void emptyStringShouldReturn_0() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}
}
