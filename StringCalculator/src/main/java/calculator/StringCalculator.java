package main.java.calculator;

public class StringCalculator {

	public int add(String input) {
		if(input.length()==1) {
			return stringToIntegerConvertor(input);
		}
		return 0;
	}

	private int stringToIntegerConvertor(String input) {
		
		return Integer.parseInt(input);
	}

}
