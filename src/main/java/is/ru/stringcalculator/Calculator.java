package is.ru.stringcalculator;

public class Calculator {

	public static int Add(String text) {
		if(text == "") {
			return 0;
		}
		else {
			if(text.contains("-")) {
				String negNumbers = getNegNumbers(text);
				throw new IllegalArgumentException("Negatives not allowed: " + negNumbers); 
			}
			if(text.contains(",") || text.contains("\n") || text.startsWith("//")) {
				String delimiter;
				if(text.startsWith("//")) {
					delimiter = text.substring(2, text.indexOf("\n"));
					text = text.substring(text.indexOf("\n") + 1, text.length());
				}
				else {
					delimiter = ",|\n";
				}
				String[] numbers = text.split(delimiter);
				int sum = 0;
				for(int i = 0; i < numbers.length; i++) {
					int number = toInt(numbers[i]);
					if(number <= 1000)
						sum += number;
				}
				return sum;
			}
			return toInt(text);
		}
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

	private static String getNegNumbers(String text) {
		String[] numbers = text.split(",|\n");
		String negNumbers = "";
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i].startsWith("-")) {
				if(negNumbers != "") {
					negNumbers += ",";
				}
				negNumbers += numbers[i];
			}
		}
		return negNumbers;
	}
}	