import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Day enum. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class DayTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValues() {
		Day[] days = {Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
		assertTrue(Arrays.equals(Day.values(), days));
	}

	@Test
	void testValueOf() {
		assertEquals(Day.valueOf("MONDAY"), Day.MONDAY);
		assertEquals(Day.valueOf("TUESDAY"), Day.TUESDAY);
		assertEquals(Day.valueOf("WEDNESDAY"), Day.WEDNESDAY);
		assertEquals(Day.valueOf("THURSDAY"), Day.THURSDAY);
		assertEquals(Day.valueOf("FRIDAY"), Day.FRIDAY);
		assertEquals(Day.valueOf("SATURDAY"), Day.SATURDAY);
		assertEquals(Day.valueOf("SUNDAY"), Day.SUNDAY);
	}

}
