package a2;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalenderTest {

	@ParameterizedTest
	@ValueSource(ints = {1904, 1910, 1956, 1972, 1976})
	public void Should_check_if_year_is_leap_also_in_gregorian(int year)
	{
		Calender a = new Calender(year);
		assertEquals(new GregorianCalendar().isLeapYear(year),a.isLeapYear());
	}

}
