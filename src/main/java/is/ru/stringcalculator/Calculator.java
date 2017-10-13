package is.ru.stringcalculator;

public class Calculator {

	public static int Add(String text) {
		if(text == "") {
			return 0;
		}
		else
		{
			if(text.contains("-")) {
				String negNumbers = getNegNumbers(text);
				throw new IllegalArgumentException("Negatives not allowed: " + negNumbers); 
			}

			
			if(text.contains(",") || text.contains("\n")) {
				String[] numbers = text.split(",|\n");
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