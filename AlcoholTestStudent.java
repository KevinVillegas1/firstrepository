import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Alcohol class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class AlcoholTestStudent {
	private Alcohol a1, a2, a3, a4;
	
	@BeforeEach
	void setUp() throws Exception {
		a1 = new Alcohol("Alcohol1", Size.SMALL, false);
		a2 = new Alcohol("Alcohol2", Size.MEDIUM, true);
		a3 = new Alcohol("Alcohol3", Size.LARGE, true);
		a4 = new Alcohol("Alcohol1", Size.SMALL, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		a1 = a2 = a3 = a4 = null;
	}

	@Test
	void testToString() {
		assertEquals("Alcohol1,SMALL,false,2.0",a1.toString());
		assertEquals("Alcohol2,MEDIUM,true,3.6",a2.toString());
		assertEquals("Alcohol3,LARGE,true,4.6",a3.toString());
		assertEquals("Alcohol1,SMALL,false,2.0",a4.toString());
	}

	@Test
	void testEqualsObject() {
		assertEquals(true,a1.equals(a4));
		assertEquals(false,a1.equals(a2));
		assertEquals(false,a1.equals(a3));
		assertEquals(false,a2.equals(a3));
		assertEquals(false,a2.equals(a4));
		assertEquals(false,a3.equals(a4));
		assertEquals(true,a4.equals(a1));
	}

	@Test
	void testCalcPrice() {
		assertEquals(a1.calcPrice(), 2.0);
		assertEquals(a2.calcPrice(), 3.6);
		assertEquals(a3.calcPrice(), 4.6);
		assertEquals(a4.calcPrice(), 2.0);
	}

	@Test
	void testIsWeekend() {
		assertEquals(a1.isWeekend(), false);
		assertEquals(a2.isWeekend(), true);
		assertEquals(a3.isWeekend(), true);
		assertEquals(a4.isWeekend(), false);
	}

	@Test
	void testGetBaseprice() {
		assertEquals(a1.getBaseprice(), 2.0);
		assertEquals(a2.getBaseprice(), 2.0);
		assertEquals(a3.getBaseprice(), 2.0);
		assertEquals(a4.getBaseprice(), 2.0);
	}

	@Test
	void testGetType() {
		assertEquals(a1.getType(), Type.ALCOHOL);
		assertEquals(a2.getType(), Type.ALCOHOL);
		assertEquals(a3.getType(), Type.ALCOHOL);
		assertEquals(a4.getType(), Type.ALCOHOL);
	}

	@Test
	void testGetBevName() {
		assertEquals(a1.getBevName(), "Alcohol1");
		assertEquals(a2.getBevName(), "Alcohol2");
		assertEquals(a3.getBevName(), "Alcohol3");
		assertEquals(a4.getBevName(), "Alcohol1");
	}

	@Test
	void testGetSize() {
		assertEquals(a1.getSize(), Size.SMALL);
		assertEquals(a2.getSize(), Size.MEDIUM);
		assertEquals(a3.getSize(), Size.LARGE);
		assertEquals(a4.getSize(), Size.SMALL);
	}

	@Test
	void testAddSizePrice() {
		assertEquals(a1.addSizePrice(), 2.0);
		assertEquals(a2.addSizePrice(), 3.0);
		assertEquals(a3.addSizePrice(), 4.0);
		assertEquals(a4.addSizePrice(), 2.0);
	}

}
