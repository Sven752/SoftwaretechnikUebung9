package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator2 {

	@Test
	public void Should_add_two_numbers_and_retrun_the_resulst()
	{
		assertEquals(2+3, Calculator.add(2,3));
	}
	
	@Test
	public void Should_subtract_two_numbers_and_retrun_the_resulst()
	{
		assertEquals(4-3, Calculator.sub(4,3));
	}

	@Test
	public void Should_multiply_two_numbers_and_retrun_the_resulst()
	{
		assertEquals(2*3, Calculator.multiply(2,3));
	}

	@Test
	public void Should_divide_two_numbers_and_retrun_the_resulst()
	{
		assertEquals(2/3, Calculator.divide(2,3));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exeption_if_denominator_is_zero()
	{
		Exception e = new ArithmeticException("ZeroDivisionError");
		assertEquals(e, Calculator.divide(2,0));

	}

}
