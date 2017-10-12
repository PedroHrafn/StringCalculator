package is.ru.stringcalculator;

public class Calculator {
	public static int Add(String text) {
		if(text == "") {
			return 0;
		}
		else
		{
			if(text.contains(",")) {
				String[] numbers = text.split(",");
				int sum = 0;
				for(int i = 0; i < numbers.length; i++)
					sum += toInt(numbers[i]);
				return sum;
			}
			return toInt(text);
		}
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}
}	