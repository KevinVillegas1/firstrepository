import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Coffee class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class CoffeeTestStudent {
	private Coffee c1, c2, c3, c4, c5;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Coffee("Coffee1", Size.SMALL, true, false);
		c2 = new Coffee("Coffee2", Size.MEDIUM, false, true);
		c3 = new Coffee("Coffee3", Size.LARGE, true, true);
		c4 = new Coffee("Coffee4", Size.MEDIUM, false, false);
		c5 = new Coffee("Coffee1", Size.SMALL, true, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		c1 = c2 = c3 = c4 = c5 = null;
	}

	@Test
	void testToString() {
		assertEquals("Coffee1,SMALL,true,false,2.5",c1.toString());
		assertEquals("Coffee2,MEDIUM,false,true,3.5",c2.toString());
		assertEquals("Coffee3,LARGE,true,true,5.0",c3.toString());
		assertEquals("Coffee4,MEDIUM,false,false,3.0",c4.toString());
		assertEquals("Coffee1,SMALL,true,false,2.5",c5.toString());
	}

	@Test
	void testEqualsObject() {
		assertEquals(true,c1.equals(c5));
		assertEquals(false,c1.equals(c2));
		assertEquals(false,c1.equals(c3));
		assertEquals(false,c1.equals(c4));
		assertEquals(false,c2.equals(c3));
		assertEquals(false,c2.equals(c4));
		assertEquals(false,c2.equals(c5));
		assertEquals(false,c3.equals(c4));
		assertEquals(false,c3.equals(c5));
		assertEquals(false,c4.equals(c5));
		assertEquals(true,c5.equals(c1));
	}

	@Test
	void testCalcPrice() {
		assertEquals(c1.calcPrice(), 2.5);
		assertEquals(c2.calcPrice(), 3.5);
		assertEquals(c3.calcPrice(), 5.0);
		assertEquals(c4.calcPrice(), 3.0);
		assertEquals(c5.calcPrice(), 2.5);
	}

	@Test
	void testGetExtraShot() {
		assertEquals(c1.getExtraShot(), true);
		assertEquals(c2.getExtraShot(), false);
		assertEquals(c3.getExtraShot(), true);
		assertEquals(c4.getExtraShot(), false);
		assertEquals(c5.getExtraShot(), true);
	}

	@Test
	void testGetExtraSyrup() {
		assertEquals(c1.getExtraSyrup(), false);
		assertEquals(c2.getExtraSyrup(), true);
		assertEquals(c3.getExtraSyrup(), true);
		assertEquals(c4.getExtraSyrup(), false);
		assertEquals(c5.getExtraSyrup(), false);
	}

	@Test
	void testGetBaseprice() {
		assertEquals(c1.getBaseprice(), 2.0);
		assertEquals(c2.getBaseprice(), 2.0);
		assertEquals(c3.getBaseprice(), 2.0);
		assertEquals(c4.getBaseprice(), 2.0);
		assertEquals(c5.getBaseprice(), 2.0);
	}

	@Test
	void testGetType() {
		assertEquals(c1.getType(), Type.COFFEE);
		assertEquals(c2.getType(), Type.COFFEE);
		assertEquals(c3.getType(), Type.COFFEE);
		assertEquals(c4.getType(), Type.COFFEE);
		assertEquals(c5.getType(), Type.COFFEE);
	}

	@Test
	void testGetBevName() {
		assertEquals(c1.getBevName(), "Coffee1");
		assertEquals(c2.getBevName(), "Coffee2");
		assertEquals(c3.getBevName(), "Coffee3");
		assertEquals(c4.getBevName(), "Coffee4");
		assertEquals(c5.getBevName(), "Coffee1");
	}

	@Test
	void testGetSize() {
		assertEquals(c1.getSize(), Size.SMALL);
		assertEquals(c2.getSize(), Size.MEDIUM);
		assertEquals(c3.getSize(), Size.LARGE);
		assertEquals(c4.getSize(), Size.MEDIUM);
		assertEquals(c5.getSize(), Size.SMALL);
	}

	@Test
	void testAddSizePrice() {
		assertEquals(c1.addSizePrice(), 2.0);
		assertEquals(c2.addSizePrice(), 3.0);
		assertEquals(c3.addSizePrice(), 4.0);
		assertEquals(c4.addSizePrice(), 3.0);
		assertEquals(c5.addSizePrice(), 2.0);
	}

}
