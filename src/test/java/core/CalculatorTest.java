package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test(timeout = 1000) //@Ignore
	public void test01_add2() {
		System.out.println("Test #01: Add 2 params");
		assertEquals("Not correct", Calculator.add(200.0, 150.0), 350.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test02_add3() {
		System.out.println("Test #02: Add 3 params");
		assertEquals("Not correct", Calculator.add(8.0, 5.0, 7.0), 20.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test03_add4() {
		System.out.println("Test #03: Add 4 params");
		assertEquals("Not correct", Calculator.add(185.3, 0.7, 10.0, 74.0), 270.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test04_divide2() {
		System.out.println("Test #04: Divide 2 params");
		assertEquals("Not correct", Calculator.divide(90.0, 30.0), 3.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test05_divide3() {
		System.out.println("Test #05: Divide 3 params");
		assertEquals("Not correct", Calculator.divide(40.0, 8.0, 2.0), 2.5, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test06_divide4() {
		System.out.println("Test #06: Divide 4 params");
		assertEquals("Not correct", Calculator.divide(600.0, 50.0, 4.0, 2.0), 1.5, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test07_multiply2() {
		System.out.println("Test #07: Multiply 2 params");
		assertEquals("Not correct", Calculator.multiply(9.0, 5.0), 45.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test08_multiply3() {
		System.out.println("Test #08: Multiply 3 params");
		assertEquals("Not correct", Calculator.multiply(20.0, 5.0, 8.0), 800.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test09_multiply4() {
		System.out.println("Test #09: Multiply 4 params");
		assertEquals("Not correct", Calculator.multiply(24.0, 4.0, 10.0, 5.0), 4800.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test10_subtract2() {
		System.out.println("Test #10: Subtract 2 params");
		assertEquals("Not correct", Calculator.subtract(28.0, 14.0), 14.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test11_subtract3() {
		System.out.println("Test #11: Subtract 3 params");
		assertEquals("Not correct", Calculator.subtract(220.0, 20.0, 120.0), 80.0, 0.09);
	}
	
	@Test(timeout = 1000) //@Ignore
	public void test12_subtract4() {
		System.out.println("Test #12: Subtract 4 params");
		assertEquals("Not correct", Calculator.subtract(400.0, 150.0, 50.0, 45.0), 155.0, 0.09);
	}

}
