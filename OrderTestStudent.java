import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the Order class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class OrderTestStudent {
	private Order o1, o2, o3, o4, o5, o6, o7;

	@BeforeEach
	void setUp() throws Exception {
		Customer c1 = new Customer("John", 20);
		Customer c2 = new Customer("Kate", 19);
		o1 = new Order(8, Day.MONDAY, c1);
		o2 = new Order(14, Day.TUESDAY, c2);
		o3 = new Order(20, Day.WEDNESDAY, c1);
		o4 = new Order(23, Day.THURSDAY, c2);
		o5 = new Order(24, Day.FRIDAY, c1);
		o6 = new Order(7, Day.SATURDAY, c2);
		o7 = new Order(16, Day.SUNDAY, c1);
	}

	@AfterEach
	void tearDown() throws Exception {
		o1 = o2 = o3 = o4 = o5 = o6 = o7 = null;
	}

	@Test
	void testGenerateOrder() {
		int orderNumber = o1.generateOrder();
		if (orderNumber >= 10000 && orderNumber <= 90000)
		{
			assertEquals(o1.getOrderNo(), orderNumber);
		}
	}

	@Test
	void testGetOrderNo() {
		int orderNumber1 = o1.generateOrder();
		int orderNumber2 = o2.generateOrder();
		int orderNumber3 = o3.generateOrder();
		int orderNumber4 = o4.generateOrder();
		int orderNumber5 = o5.generateOrder();
		int orderNumber6 = o6.generateOrder();
		int orderNumber7 = o7.generateOrder();
		assertEquals(o1.getOrderNo(), orderNumber1);
		assertEquals(o2.getOrderNo(), orderNumber2);
		assertEquals(o3.getOrderNo(), orderNumber3);
		assertEquals(o4.getOrderNo(), orderNumber4);
		assertEquals(o5.getOrderNo(), orderNumber5);
		assertEquals(o6.getOrderNo(), orderNumber6);
		assertEquals(o7.getOrderNo(), orderNumber7);
	}

	@Test
	void testGetOrderTime() {
		assertEquals(o1.getOrderTime(), 8);
		assertEquals(o2.getOrderTime(), 14);
		assertEquals(o3.getOrderTime(), 20);
		assertEquals(o4.getOrderTime(), 23);
		assertEquals(o5.getOrderTime(), 24);
		assertEquals(o6.getOrderTime(), 7);
		assertEquals(o7.getOrderTime(), 16);
	}

	@Test
	void testGetOrderDay() {
		assertEquals(o1.getOrderDay(), Day.MONDAY);
		assertEquals(o2.getOrderDay(), Day.TUESDAY);
		assertEquals(o3.getOrderDay(), Day.WEDNESDAY);
		assertEquals(o4.getOrderDay(), Day.THURSDAY);
		assertEquals(o5.getOrderDay(), Day.FRIDAY);
		assertEquals(o6.getOrderDay(), Day.SATURDAY);
		assertEquals(o7.getOrderDay(), Day.SUNDAY);
	}

	@Test
	void testGetCustomer() {
		Customer c1 = o1.getCustomer();
		assertEquals(c1.getName(), "John");
		assertEquals(c1.getAge(), 20);
		Customer c2 = o2.getCustomer();
		assertEquals(c2.getName(), "Kate");
		assertEquals(c2.getAge(), 19);
	}

	@Test
	void testGetDay() {
		assertEquals(o1.getDay(), Day.MONDAY);
		assertEquals(o2.getDay(), Day.TUESDAY);
		assertEquals(o3.getDay(), Day.WEDNESDAY);
		assertEquals(o4.getDay(), Day.THURSDAY);
		assertEquals(o5.getDay(), Day.FRIDAY);
		assertEquals(o6.getDay(), Day.SATURDAY);
		assertEquals(o7.getDay(), Day.SUNDAY);
	}

	@Test
	void testIsWeekend() {
		assertEquals(o1.isWeekend(), false);
		assertEquals(o2.isWeekend(), false);
		assertEquals(o3.isWeekend(), false);
		assertEquals(o4.isWeekend(), false);
		assertEquals(o5.isWeekend(), false);
		assertEquals(o6.isWeekend(), true);
		assertEquals(o7.isWeekend(), true);
	}

	@Test
	void testGetBeverage() {
		Coffee c1 = new Coffee("Coffee1", Size.LARGE, true, false);
		Alcohol a1 = new Alcohol("Alcohol1", Size.SMALL, false);
		Smoothie s1 = new Smoothie("Smoothie1", Size.LARGE, 5, false);
		Smoothie s2 = new Smoothie("Smoothie2", Size.MEDIUM, 3, true);

		o1.addNewBeverage("Coffee1", Size.LARGE, true, false);
		o1.addNewBeverage("Alcohol1", Size.SMALL);
		o1.addNewBeverage("Smoothie1", Size.LARGE, 5, false);
		assertTrue(o1.getBeverage(0).equals(c1));
		assertTrue(o1.getBeverage(1).equals(a1));
		assertTrue(o1.getBeverage(2).equals(s1));
		assertFalse(o1.getBeverage(2).equals(s2));
		
		Coffee c2 = new Coffee("Coffee2", Size.MEDIUM, false, true);
		Alcohol a2 = new Alcohol("Alcohol2", Size.LARGE, false);
		Smoothie s3 = new Smoothie("Smoothie3", Size.SMALL, 2, true);
		Smoothie s4 = new Smoothie("Smoothie4", Size.MEDIUM, 4, false);

		o2.addNewBeverage("Coffee2", Size.MEDIUM, false, true);
		o2.addNewBeverage("Alcohol2", Size.LARGE);
		o2.addNewBeverage("Smoothie3", Size.SMALL, 2, true);
		o2.addNewBeverage("Smoothie4", Size.MEDIUM, 4, false);
		assertTrue(o2.getBeverage(0).equals(c2));
		assertTrue(o2.getBeverage(1).equals(a2));
		assertTrue(o2.getBeverage(2).equals(s3));
		assertTrue(o2.getBeverage(3).equals(s4));
	}

	@Test
	void testGetTotalItems() {
		assertTrue(o1.getTotalItems() == 0);
		o1.addNewBeverage("Coffee1", Size.SMALL, false, true);
		assertTrue(o1.getBeverage(0).getType().equals(Type.COFFEE));
		assertTrue(o1.getTotalItems() == 1);
		o1.addNewBeverage("Coffee2", Size.MEDIUM, true, false);
		assertTrue(o1.getBeverage(1).getType().equals(Type.COFFEE));
		assertTrue(o1.getTotalItems() == 2);
		o1.addNewBeverage("Coffee3", Size.LARGE, false, false);
		assertTrue(o1.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(o1.getTotalItems() == 3);
	}

	@Test
	void testAddNewBeverageStringSizeBooleanBoolean() {
		assertTrue(o1.getTotalItems() == 0);
		o1.addNewBeverage("Coffee1", Size.SMALL, true, true);
		assertTrue(o1.getBeverage(0).getType().equals(Type.COFFEE));
		assertTrue(o1.getTotalItems() == 1);
		o1.addNewBeverage("Coffee2", Size.MEDIUM, true, false);
		assertTrue(o1.getBeverage(1).getType().equals(Type.COFFEE));
		assertTrue(o1.getTotalItems() == 2);
		o1.addNewBeverage("Coffee3", Size.LARGE, false, false);
		assertTrue(o1.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(o1.getTotalItems() == 3);
		
		assertTrue(o2.getTotalItems() == 0);
		o2.addNewBeverage("Coffee4", Size.MEDIUM, false, true);
		assertTrue(o2.getBeverage(0).getType().equals(Type.COFFEE));
		assertTrue(o2.getTotalItems() == 1);
		o2.addNewBeverage("Coffee5", Size.LARGE, true, true);
		assertTrue(o2.getBeverage(1).getType().equals(Type.COFFEE));
		assertTrue(o2.getTotalItems() == 2);
		o2.addNewBeverage("Coffee6", Size.SMALL, true, false);
		assertTrue(o2.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(o2.getTotalItems() == 3);
	}

	@Test
	void testAddNewBeverageStringSize() {
		assertTrue(o1.getTotalItems() == 0);
		o1.addNewBeverage("Alcohol1", Size.MEDIUM);
		assertTrue(o1.getBeverage(0).getType().equals(Type.ALCOHOL));
		assertTrue(o1.getTotalItems() == 1);
		o1.addNewBeverage("Alcohol2", Size.SMALL);
		assertTrue(o1.getBeverage(1).getType().equals(Type.ALCOHOL));
		assertTrue(o1.getTotalItems() == 2);
		o1.addNewBeverage("Alcohol3", Size.LARGE);
		assertTrue(o1.getBeverage(2).getType().equals(Type.ALCOHOL));
		assertTrue(o1.getTotalItems() == 3);
		
		assertTrue(o2.getTotalItems() == 0);
		o2.addNewBeverage("Alcohol4", Size.LARGE);
		assertTrue(o2.getBeverage(0).getType().equals(Type.ALCOHOL));
		assertTrue(o2.getTotalItems() == 1);
		o2.addNewBeverage("Alcohol5", Size.MEDIUM);
		assertTrue(o2.getBeverage(1).getType().equals(Type.ALCOHOL));
		assertTrue(o2.getTotalItems() == 2);
		o2.addNewBeverage("Alcohol6", Size.SMALL);
		assertTrue(o2.getBeverage(2).getType().equals(Type.ALCOHOL));
		assertTrue(o2.getTotalItems() == 3);
	}

	@Test
	void testAddNewBeverageStringSizeIntBoolean() {
		assertTrue(o1.getTotalItems() == 0);
		o1.addNewBeverage("Smoothie1", Size.SMALL, 1, true);
		assertTrue(o1.getBeverage(0).getType().equals(Type.SMOOTHIE));
		assertTrue(o1.getTotalItems() == 1);
		o1.addNewBeverage("Smoothie2", Size.MEDIUM, 2, false);
		assertTrue(o1.getBeverage(1).getType().equals(Type.SMOOTHIE));
		assertTrue(o1.getTotalItems() == 2);
		o1.addNewBeverage("Smoothie3", Size.LARGE, 3, false);
		assertTrue(o1.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(o1.getTotalItems() == 3);
		
		assertTrue(o2.getTotalItems() == 0);
		o2.addNewBeverage("Smoothie4", Size.MEDIUM, 4, true);
		assertTrue(o2.getBeverage(0).getType().equals(Type.SMOOTHIE));
		assertTrue(o2.getTotalItems() == 1);
		o2.addNewBeverage("Smoothie5", Size.LARGE, 5, true);
		assertTrue(o2.getBeverage(1).getType().equals(Type.SMOOTHIE));
		assertTrue(o2.getTotalItems() == 2);
		o2.addNewBeverage("Smoothie6", Size.SMALL, 0, false);
		assertTrue(o2.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(o2.getTotalItems() == 3);
	}

	@Test
	void testCalcOrderTotal() {
		o1.addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		o1.addNewBeverage("Alcohol1", Size.LARGE);
		o1.addNewBeverage("Smoothie1", Size.SMALL, 1, false);

		assertEquals(10.0, o1.calcOrderTotal(), .01);

		o1.addNewBeverage("Coffee2", Size.SMALL, true, true);
		o1.addNewBeverage("Alcohol2", Size.MEDIUM);
		o1.addNewBeverage("Smoothie2", Size.LARGE, 4, false);

		assertEquals(22.0, o1.calcOrderTotal(), .01);
		
		o2.addNewBeverage("Coffee3", Size.SMALL, false, false);
		o2.addNewBeverage("Alcohol3", Size.SMALL);
		o2.addNewBeverage("Smoothie3", Size.LARGE, 1, false);

		assertEquals(8.5, o2.calcOrderTotal(), .01);

		o2.addNewBeverage("Coffee4", Size.MEDIUM, true, false);
		o2.addNewBeverage("Alcohol4", Size.MEDIUM);
		o2.addNewBeverage("Smoothie4", Size.SMALL, 4, true);

		assertEquals(20.5, o2.calcOrderTotal(), .01);
	}

	@Test
	void testFindNumOfBeveType() {
		o1.addNewBeverage("Coffee1", Size.MEDIUM, false, true);
		o1.addNewBeverage("Alcohol1", Size.LARGE);
		o1.addNewBeverage("Smoothie1", Size.SMALL, 2, true);
		o1.addNewBeverage("Smoothie2", Size.MEDIUM, 4, false);
		assertEquals(o1.findNumOfBeveType(Type.SMOOTHIE), 2);
		assertEquals(o1.findNumOfBeveType(Type.COFFEE), 1);
	}

	@Test
	void testListOfBeverages() {
		o1.addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		o1.addNewBeverage("Alcohol1", Size.LARGE);
		o1.addNewBeverage("Smoothie1", Size.SMALL, 1, false);
		assertEquals(o1.listOfBeverages(), ",Coffee1,MEDIUM,true,false,3.5,Alcohol1,LARGE,false,4.0,Smoothie1,SMALL,false,1,2.5");
	}

	@Test
	void testToString() {
		int orderNumber = o1.generateOrder();
		o1.addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		o1.addNewBeverage("Alcohol1", Size.LARGE);
		o1.addNewBeverage("Smoothie1", Size.SMALL, 1, false);
		assertEquals(o1.toString(), "" + orderNumber + ",8,MONDAY,John,20,Coffee1,MEDIUM,true,false,3.5,Alcohol1,LARGE,false,4.0,Smoothie1,SMALL,false,1,2.5");
	}

	@Test
	void testCompareTo() {
		int orderNumber1 = o1.generateOrder();
		int orderNumber2 = o2.generateOrder();
		int num = 0;
		if (orderNumber1 > orderNumber2)
		{
			num = 1;
		}
		else if (orderNumber1 < orderNumber2)
		{
			num = -1;
		}
		else if (orderNumber1 == orderNumber2)
		{
			num = 0;
		}
		assertEquals(o1.compareTo(o2), num);
	}

}
