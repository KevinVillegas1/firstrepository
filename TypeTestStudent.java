import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Type enum. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class TypeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValues() {
		Type[] types = {Type.COFFEE, Type.SMOOTHIE, Type.ALCOHOL};
		assertTrue(Arrays.equals(Type.values(), types));
	}

	@Test
	void testValueOf() {
		assertEquals(Type.valueOf("COFFEE"), Type.COFFEE);
		assertEquals(Type.valueOf("SMOOTHIE"), Type.SMOOTHIE);
		assertEquals(Type.valueOf("ALCOHOL"), Type.ALCOHOL);
	}

}
