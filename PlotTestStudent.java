import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Plot class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 11/07/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class PlotTestStudent {
	private Plot plot1, plot2, plot3, plot4, plot5;
	
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot();
		plot2 = new Plot(3, 1, 2, 2);
		plot3 = new Plot(9, 3, 2, 3);
		plot4 = new Plot(plot2);
		plot5 = new Plot(0,0,10,10);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot2 = plot3 = plot4 = plot5 = null;
	}
	
	@Test
	void testGetX() {
		assertEquals(plot1.getX(), 0);
		assertEquals(plot2.getX(), 3);
		assertEquals(plot3.getX(), 9);
		assertEquals(plot4.getX(), 3);
		assertEquals(plot5.getX(), 0);
	}
	
	@Test
	void testGetY() {
		assertEquals(plot1.getY(), 0);
		assertEquals(plot2.getY(), 1);
		assertEquals(plot3.getY(), 3);
		assertEquals(plot4.getY(), 1);
		assertEquals(plot5.getY(), 0);
	}
	
	@Test
	void testGetWidth() {
		assertEquals(plot1.getWidth(), 1);
		assertEquals(plot2.getWidth(), 2);
		assertEquals(plot3.getWidth(), 2);
		assertEquals(plot4.getWidth(), 2);
		assertEquals(plot5.getWidth(), 10);
	}
	
	@Test
	void testGetDepth() {
		assertEquals(plot1.getDepth(), 1);
		assertEquals(plot2.getDepth(), 2);
		assertEquals(plot3.getDepth(), 3);
		assertEquals(plot4.getDepth(), 2);
		assertEquals(plot5.getDepth(), 10);
	}

	@Test
	void testOverlaps() {
		assertTrue(plot2.overlaps(plot4));
		assertFalse(plot1.overlaps(plot2));
		assertFalse(plot2.overlaps(plot3));
		assertFalse(plot4.overlaps(plot3));
		assertFalse(plot1.overlaps(plot4));
		assertFalse(plot1.overlaps(plot3));
		
	}

	@Test
	void testEncompasses() {
		assertFalse(plot5.encompasses(plot3));
		assertTrue(plot5.encompasses(plot1));
		assertTrue(plot5.encompasses(plot2));
		assertTrue(plot5.encompasses(plot4));
	}

	@Test
	void testToString() {
		assertEquals("0,0,1,1",plot1.toString());
		assertEquals("3,1,2,2",plot2.toString());
		assertEquals("9,3,2,3",plot3.toString());
		assertEquals("3,1,2,2",plot4.toString());
		assertEquals("0,0,10,10",plot5.toString());
	}

}
