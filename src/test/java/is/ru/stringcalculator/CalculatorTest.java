package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.Add(""));
	}
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.Add("1"));
		assertEquals(2, Calculator.Add("2"));
	}
	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.Add("1,2"));
		assertEquals(2, Calculator.Add("1,1"));
	}
	@Test
	public void testManyNumbers() {
		assertEquals(7, Calculator.Add("1,2,4"));
		assertEquals(10, Calculator.Add("1,2,3,4"));
		assertEquals(20, Calculator.Add("5,10,3,2"));
	}

}