import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the HolidayBonus class.
 * It will test to make sure all the methods in the class work properly.
 * Due: 11/28/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class HolidayBonusTestStudent {
	private double[][] data1 = {{1,2,3},{4,5},{6,7,8}};
	private double[][] data2 = {{7,2,9,4},{5},{8,1,3},{11,6,7,2}};
	private double[][] data3 = {{7.2,2.5,9.3,4.8},{5.9},{8.1,1.7,3.3},{11.6,6.9,7.3,2.7}};
	private double[][] data4 = {{-2.5,-5.3,6.1},{-4.4,8.2},{2.3,-7.5},{-4.2,7.3,-5.9,2.6}};
	private double[][] data5 = {{1.65,4.50,2.36,7.45,3.44,6.23},{2.22,-3.24,-1.66,-5.48,3.46},{4.23,2.29,5.29},{2.76,3.76,4.29,5.48,3.43},{3.38,3.65,3.76},{2.46,3.34,2.38,8.26,5.34}};
	private double[][] data6 = {{1253.65,4.50,2154.36,7532.45,3388.44},{2876.22,-3.24,1954.66},{4896.23,2.29,5499.29},{2256.76,3.76,4286.29,5438.48,3794.43},{3184.38,3654.65,3455.76,6387.23,4265.77,4592.45},{2657.46,3265.34,2256.38,8935.26,5287.34,6598.23}};
	private double[][] data7 = {{12536.54,45665.05,21543.66,75324.57,33884.48,65982.39},{28762.21,35762.42,19546.63},{48962.34,28552.95,23863.66,54992.97},{22567.63,36237.64,42862.95,54384.86,37944.37},{31843.86,36546.57,34557.68,63872.39,42657.70,45924.51},{26574.65,32653.46,22563.87,89352.68,52873.49}};
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculateHolidayBonus() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(data1);
			assertEquals(3000.0, result[0], .001);
			assertEquals(4000.0, result[1], .001);
			assertEquals(15000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(data2);
			assertEquals(14000.0, result[0], .001);
			assertEquals(1000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);
			assertEquals(13000.0, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(data3);
			assertEquals(14000.0, result[0], .001);
			assertEquals(1000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);
			assertEquals(13000.0, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(data4);
			assertEquals(5000.0, result[0], .001);
			assertEquals(5000.0, result[1], .001);
			assertEquals(5000.0, result[2], .001);
			assertEquals(7000.0, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(data5);
			assertEquals(17000.0, result[0], .001);
			assertEquals(4000.0, result[1], .001);
			assertEquals(12000.0, result[2], .001);
			assertEquals(9000.0, result[3], .001);
			assertEquals(6000.0, result[4], .001);
			assertEquals(16000.0, result[5], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(data6);
			assertEquals(8000.0, result[0], .001);
			assertEquals(3000.0, result[1], .001);
			assertEquals(12000.0, result[2], .001);
			assertEquals(9000.0, result[3], .001);
			assertEquals(14000.0, result[4], .001);
			assertEquals(21000.0, result[5], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(data7);
			assertEquals(16000.0, result[0], .001);
			assertEquals(5000.0, result[1], .001);
			assertEquals(10000.0, result[2], .001);
			assertEquals(12000.0, result[3], .001);
			assertEquals(11000.0, result[4], .001);
			assertEquals(16000.0, result[5], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(data1), .001);
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(data2), .001);
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(data3), .001);
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(data4), .001);
		assertEquals(64000.0, HolidayBonus.calculateTotalHolidayBonus(data5), .001);
		assertEquals(67000.0, HolidayBonus.calculateTotalHolidayBonus(data6), .001);
		assertEquals(70000.0, HolidayBonus.calculateTotalHolidayBonus(data7), .001);
	}

}
