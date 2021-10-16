package main.java.calculator;

public class StringCalculator {

	public int add(String input) {
		String[] numbers = input.split(",");
		if (isEmpty(input)) {
			return 0;
		} else {
			return stringToIntegerConvertor(numbers);
		}

	}

	// cheacking string is empty
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	// for String to integer convert
	private int stringToIntegerConvertor(String[] numbers) {
		int sum = 0;
		for (String num : numbers) {
			sum += Integer.parseInt(num);
		}

		return sum;
	}

}
