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

	@Test
	public void TestMultipleNumbers() {
		
		assertEquals(10, Calculator.add("1,4,5"));
	}

	@Test
	public void TestNewlinesInNumbers() {
		
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void TestNegativeNumbers() {
		
		RuntimeException exception = null;
	    try {
	        Calculator.add("2,-4,3,-5");
	    } 
	    catch (RuntimeException e) {
	        exception = e;
	    }

	    assertEquals("Negatives not allowed: -4, -5", exception.getMessage());

	}

	@Test
	public void TestBigNumbers() {
		
		assertEquals(1009, Calculator.add("3,1000,1201,6,1425"));
	}

	

	
}