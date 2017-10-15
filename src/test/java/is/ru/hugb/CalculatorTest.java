package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void EmptyStringTest() {
		
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void firstTest1() {
		
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void TestTwoNumbers() {
		
		assertEquals(3, Calculator.add("1,2"));
	}

	
}