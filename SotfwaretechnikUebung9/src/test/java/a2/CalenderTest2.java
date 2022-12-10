package a2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class CalenderTest2 {

	//durch vier Teilbar aer nicht durch 100
	@Test
	void test1() {
		Calender a = new Calender(1996);
		assertEquals(new GregorianCalendar().isLeapYear(1996),a.isLeapYear());
	}
	
	//durch einhundert Teilbar aber nicht durch 400
	@Test
	void test2() {
		Calender a = new Calender(2000);
		assertEquals(new GregorianCalendar().isLeapYear(2000),a.isLeapYear());
	}
	
//	//durch 400 Teilbar
//	@Test
//	void test3() {
//		Calender a = new Calender(year);
//		assertEquals(new GregorianCalendar().isLeapYear(year),a.isLeapYear());
//	}
	
	//kein Schaltjahr
	@Test
	void test4() {
		Calender a = new Calender(1903);
		assertEquals(new GregorianCalendar().isLeapYear(1903),a.isLeapYear());
	}

}
