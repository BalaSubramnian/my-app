package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcals {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int result = calc.add(5, 5);
		assertEquals(10, result);		
	}
	
	@Test
	public void testMul(){
		Calculator calc = new Calculator();
		int result = calc.multiply(5, 5);
		assertEquals(25, result);
	}
	
	@Test
	public void testSub(){
		Calculator calc = new Calculator();
		int result = calc.substract(10, 5);
		assertEquals(5, result);
	}
	@Test
	public void testDiv(){
		Calculator calc = new Calculator();
		int result = calc.divide(10, 5);
		assertEquals(2, result);
	}
}
