import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Customer class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class CustomerTestStudent {
	private Customer c1, c2, c3;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Customer("John", 20);
		c2 = new Customer("Kate", 19);
		c3 = new Customer(c2);
	}

	@AfterEach
	void tearDown() throws Exception {
		c1 = c2 = c3 = null;
	}

	@Test
	void testGetAge() {
		assertEquals(c1.getAge(), 20);
		assertEquals(c2.getAge(), 19);
		assertEquals(c3.getAge(), 19);
	}

	@Test
	void testSetAge() {
		c1.setAge(23);
		assertEquals(c1.getAge(), 23);
		c2.setAge(18);
		assertEquals(c2.getAge(), 18);
		c3.setAge(21);
		assertEquals(c3.getAge(), 21);
	}

	@Test
	void testGetName() {
		assertEquals(c1.getName(), "John");
		assertEquals(c2.getName(), "Kate");
		assertEquals(c3.getName(), "Kate");
	}

	@Test
	void testSetName() {
		c1.setName("Jacob");
		assertEquals(c1.getName(), "Jacob");
		c2.setName("Jane");
		assertEquals(c2.getName(), "Jane");
		c3.setName("Amanda");
		assertEquals(c3.getName(), "Amanda");
	}

	@Test
	void testToString() {
		assertEquals("John,20",c1.toString());
		assertEquals("Kate,19",c2.toString());
		assertEquals("Kate,19",c3.toString());
	}

}
