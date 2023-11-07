import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Property class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 11/07/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class PropertyTestStudent {
	Property propertyOne, propertyTwo, propertyThree, propertyFour;

	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property();
		propertyTwo = new Property("Bank Property", "Washington", 3260.00, "Capital One Bank");
		propertyThree = new Property("Movie Theater", "Silver Spring", 4580.00, "Regal", 4, 6, 2, 2);
		propertyFour = new Property(propertyThree);
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = propertyTwo = propertyThree = propertyFour = null;
	}

	@Test
	void testGetCity() {
		assertEquals("", propertyOne.getCity());
		assertEquals("Washington", propertyTwo.getCity());
		assertEquals("Silver Spring", propertyThree.getCity());
		assertEquals("Silver Spring", propertyFour.getCity());
	}

	@Test
	void testGetOwner() {
		assertEquals("", propertyOne.getOwner());
		assertEquals("Capital One Bank", propertyTwo.getOwner());
		assertEquals("Regal", propertyThree.getOwner());
		assertEquals("Regal", propertyFour.getOwner());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, propertyOne.getPlot().getX());
		assertEquals(0, propertyOne.getPlot().getY());
		assertEquals(1, propertyOne.getPlot().getWidth());
		assertEquals(1, propertyOne.getPlot().getDepth());
		assertEquals(0, propertyTwo.getPlot().getX());
		assertEquals(0, propertyTwo.getPlot().getY());
		assertEquals(1, propertyTwo.getPlot().getWidth());
		assertEquals(1, propertyTwo.getPlot().getDepth());
		assertEquals(4, propertyThree.getPlot().getX());
		assertEquals(6, propertyThree.getPlot().getY());
		assertEquals(2, propertyThree.getPlot().getWidth());
		assertEquals(2, propertyThree.getPlot().getDepth());
		assertEquals(4, propertyFour.getPlot().getX());
		assertEquals(6, propertyFour.getPlot().getY());
		assertEquals(2, propertyFour.getPlot().getWidth());
		assertEquals(2, propertyFour.getPlot().getDepth());
	}

	@Test
	void testGetPropertyName() {
		assertEquals("", propertyOne.getPropertyName());
		assertEquals("Bank Property", propertyTwo.getPropertyName());
		assertEquals("Movie Theater", propertyThree.getPropertyName());
		assertEquals("Movie Theater", propertyFour.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(0.0, propertyOne.getRentAmount());
		assertEquals(3260.00, propertyTwo.getRentAmount());
		assertEquals(4580.00, propertyThree.getRentAmount());
		assertEquals(4580.00, propertyFour.getRentAmount());
	}

	@Test
	void testToString() {
		assertEquals(",,,0.0",propertyOne.toString());
		assertEquals("Bank Property,Washington,Capital One Bank,3260.0",propertyTwo.toString());
		assertEquals("Movie Theater,Silver Spring,Regal,4580.0",propertyThree.toString());
		assertEquals("Movie Theater,Silver Spring,Regal,4580.0",propertyFour.toString());
	}

}
