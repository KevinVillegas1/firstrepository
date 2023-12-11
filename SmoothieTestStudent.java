import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Smoothie class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class SmoothieTestStudent {
	private Smoothie s1, s2, s3, s4, s5;

	@BeforeEach
	void setUp() throws Exception {
		s1 = new Smoothie("Smoothie1", Size.SMALL, 1, true);
		s2 = new Smoothie("Smoothie2", Size.MEDIUM, 2, false);
		s3 = new Smoothie("Smoothie3", Size.LARGE, 3, true);
		s4 = new Smoothie("Smoothie4", Size.MEDIUM, 4, false);
		s5 = new Smoothie("Smoothie1", Size.SMALL, 1, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		s1 = s2 = s3 = s4 = s5 = null;
	}

	@Test
	void testToString() {
		assertEquals("Smoothie1,SMALL,true,1,4.0",s1.toString());
		assertEquals("Smoothie2,MEDIUM,false,2,4.0",s2.toString());
		assertEquals("Smoothie3,LARGE,true,3,7.0",s3.toString());
		assertEquals("Smoothie4,MEDIUM,false,4,5.0",s4.toString());
		assertEquals("Smoothie1,SMALL,true,1,4.0",s5.toString());
	}

	@Test
	void testEqualsObject() {
		assertEquals(true,s1.equals(s5));
		assertEquals(false,s1.equals(s2));
		assertEquals(false,s1.equals(s3));
		assertEquals(false,s1.equals(s4));
		assertEquals(false,s2.equals(s3));
		assertEquals(false,s2.equals(s4));
		assertEquals(false,s2.equals(s5));
		assertEquals(false,s3.equals(s4));
		assertEquals(false,s3.equals(s5));
		assertEquals(false,s4.equals(s5));
		assertEquals(true,s5.equals(s1));
	}

	@Test
	void testCalcPrice() {
		assertEquals(s1.calcPrice(), 4.0);
		assertEquals(s2.calcPrice(), 4.0);
		assertEquals(s3.calcPrice(), 7.0);
		assertEquals(s4.calcPrice(), 5.0);
		assertEquals(s5.calcPrice(), 4.0);
	}

	@Test
	void testGetNumOfFruits() {
		assertEquals(s1.getNumOfFruits(), 1);
		assertEquals(s2.getNumOfFruits(), 2);
		assertEquals(s3.getNumOfFruits(), 3);
		assertEquals(s4.getNumOfFruits(), 4);
		assertEquals(s5.getNumOfFruits(), 1);
	}

	@Test
	void testGetAddProtein() {
		assertEquals(s1.getAddProtein(), true);
		assertEquals(s2.getAddProtein(), false);
		assertEquals(s3.getAddProtein(), true);
		assertEquals(s4.getAddProtein(), false);
		assertEquals(s5.getAddProtein(), true);
	}

	@Test
	void testGetBaseprice() {
		assertEquals(s1.getBaseprice(), 2.0);
		assertEquals(s2.getBaseprice(), 2.0);
		assertEquals(s3.getBaseprice(), 2.0);
		assertEquals(s4.getBaseprice(), 2.0);
		assertEquals(s5.getBaseprice(), 2.0);
	}

	@Test
	void testGetType() {
		assertEquals(s1.getType(), Type.SMOOTHIE);
		assertEquals(s2.getType(), Type.SMOOTHIE);
		assertEquals(s3.getType(), Type.SMOOTHIE);
		assertEquals(s4.getType(), Type.SMOOTHIE);
		assertEquals(s5.getType(), Type.SMOOTHIE);
	}

	@Test
	void testGetBevName() {
		assertEquals(s1.getBevName(), "Smoothie1");
		assertEquals(s2.getBevName(), "Smoothie2");
		assertEquals(s3.getBevName(), "Smoothie3");
		assertEquals(s4.getBevName(), "Smoothie4");
		assertEquals(s5.getBevName(), "Smoothie1");
	}

	@Test
	void testGetSize() {
		assertEquals(s1.getSize(), Size.SMALL);
		assertEquals(s2.getSize(), Size.MEDIUM);
		assertEquals(s3.getSize(), Size.LARGE);
		assertEquals(s4.getSize(), Size.MEDIUM);
		assertEquals(s5.getSize(), Size.SMALL);
	}

	@Test
	void testAddSizePrice() {
		assertEquals(s1.addSizePrice(), 2.0);
		assertEquals(s2.addSizePrice(), 3.0);
		assertEquals(s3.addSizePrice(), 4.0);
		assertEquals(s4.addSizePrice(), 3.0);
		assertEquals(s5.addSizePrice(), 2.0);
	}

}
