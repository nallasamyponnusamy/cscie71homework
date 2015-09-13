package cscie71homework;


import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator calc = new Calculator();
		int actual = calc.sum(9, 5);
		int expected = 14;
		assertEquals(expected, actual);
	}
}