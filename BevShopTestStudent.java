import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the BevShop class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class BevShopTestStudent {
	BevShop b;

	@BeforeEach
	void setUp() throws Exception {
		b = new BevShop();
	}

	@AfterEach
	void tearDown() throws Exception {
		b = null;
	}

	@Test
	void testIsValidTime() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		assertEquals(b.isValidTime(b.getCurrentOrder().getOrderTime()), true);
		b.startNewOrder(7, Day.SATURDAY, "Kate", 19);
		assertEquals(b.isValidTime(b.getCurrentOrder().getOrderTime()), false);
	}

	@Test
	void testGetMaxNumOfFruits() {
		assertEquals(b.getMaxNumOfFruits(), 5);
	}

	@Test
	void testGetMinAgeForAlcohol() {
		assertEquals(b.getMinAgeForAlcohol(), 21);
	}

	@Test
	void testIsMaxFruit() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 5, false);
		assertEquals(b.isMaxFruit(5), false);
		b.getCurrentOrder().addNewBeverage("Smoothie2", Size.SMALL, 6, false);
		assertEquals(b.isMaxFruit(6), true);
	}

	@Test
	void testGetMaxOrderForAlcohol() {
		assertEquals(b.getMaxOrderForAlcohol(), 3);
	}

	@Test
	void testIsEligibleForMore() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.MEDIUM);
		b.getCurrentOrder().addNewBeverage("Alcohol2", Size.SMALL);
		assertEquals(b.isEligibleForMore(), false);
		b.getCurrentOrder().addNewBeverage("Alcohol3", Size.SMALL);
		assertEquals(b.isEligibleForMore(), true);
	}

	@Test
	void testGetNumOfAlcoholDrink() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.MEDIUM);
		b.getCurrentOrder().addNewBeverage("Alcohol2", Size.SMALL);
		assertEquals(b.getNumOfAlcoholDrink(), 2);
		b.getCurrentOrder().addNewBeverage("Alcohol3", Size.SMALL);
		assertEquals(b.getNumOfAlcoholDrink(), 3);
	}

	@Test
	void testIsValidAge() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		assertEquals(b.isValidAge(b.getCurrentOrder().getCustomer().getAge()), false);
		b.startNewOrder(8, Day.MONDAY, "Kate", 21);
		assertEquals(b.isValidAge(b.getCurrentOrder().getCustomer().getAge()), true);
	}

	@Test
	void testStartNewOrder() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		assertEquals(b.getCurrentOrder().getOrderTime(), 8);
		assertEquals(b.getCurrentOrder().getOrderDay(), Day.MONDAY);
		assertEquals(b.getCurrentOrder().getCustomer().getName(), "John");
		assertEquals(b.getCurrentOrder().getCustomer().getAge(), 20);
	}

	@Test
	void testProcessCoffeeOrder() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		b.getCurrentOrder().addNewBeverage("Coffee1", Size.SMALL, false, false);
		assertEquals(b.getCurrentOrder().findNumOfBeveType(Type.COFFEE), 1);
	}

	@Test
	void testProcessAlcoholOrder() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.SMALL);
		assertEquals(b.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL), 1);
	}

	@Test
	void testProcessSmoothieOrder() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 5, false);
		assertEquals(b.getCurrentOrder().findNumOfBeveType(Type.SMOOTHIE), 1);
	}

	@Test
	void testFindOrder() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		int orderNumber1 = b.getCurrentOrder().generateOrder();
		assertEquals(b.findOrder(orderNumber1), 0);
		b.startNewOrder(8, Day.MONDAY, "Kate", 21);
		int orderNumber2 = b.getCurrentOrder().generateOrder();
		assertEquals(b.findOrder(orderNumber2), 1);
	}

	@Test
	void testTotalOrderPrice() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		int orderNumber1 = b.getCurrentOrder().generateOrder();
		b.getCurrentOrder().addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.LARGE);
		b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 1, false);
		assertEquals(10.0, b.totalOrderPrice(orderNumber1), .01);
		
	}

	@Test
	void testTotalMonthlySale() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		b.getCurrentOrder().addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.LARGE);
		b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 1, false);
		assertEquals(10.0, b.totalMonthlySale(), .01);
		b.startNewOrder(8, Day.MONDAY, "Kate", 19);
		b.getCurrentOrder().addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.LARGE);
		b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 1, false);
		assertEquals(20.0, b.totalMonthlySale(), .01);
	}

	@Test
	void testTotalNumOfMonthlyOrders() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		assertEquals(b.totalNumOfMonthlyOrders(), 1);
		b.startNewOrder(8, Day.MONDAY, "Kate", 19);
		assertEquals(b.totalNumOfMonthlyOrders(), 2);
	}

	@Test
	void testGetCurrentOrder() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		assertEquals(b.getCurrentOrder().getOrderTime(), 8);
		assertEquals(b.getCurrentOrder().getOrderDay(), Day.MONDAY);
		assertEquals(b.getCurrentOrder().getCustomer().getName(), "John");
		assertEquals(b.getCurrentOrder().getCustomer().getAge(), 20);
		
	}

	@Test
	void testGetOrderAtIndex() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		assertEquals(b.getCurrentOrder().getOrderTime(), 8);
		assertEquals(b.getCurrentOrder().getOrderDay(), Day.MONDAY);
		assertEquals(b.getCurrentOrder().getCustomer().getName(), "John");
		assertEquals(b.getCurrentOrder().getCustomer().getAge(), 20);
		b.startNewOrder(9, Day.TUESDAY, "Kate", 19);
		assertEquals(b.getCurrentOrder().getOrderTime(), 9);
		assertEquals(b.getCurrentOrder().getOrderDay(), Day.TUESDAY);
		assertEquals(b.getCurrentOrder().getCustomer().getName(), "Kate");
		assertEquals(b.getCurrentOrder().getCustomer().getAge(), 19);
	}

	@Test
	void testSortOrders() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		int orderNumber1 = b.getCurrentOrder().generateOrder();
		b.startNewOrder(9, Day.TUESDAY, "Kate", 19);
		int orderNumber2 = b.getCurrentOrder().generateOrder();
		b.startNewOrder(10, Day.WEDNESDAY, "Jane", 18);
		int orderNumber3 = b.getCurrentOrder().generateOrder();
		b.sortOrders();
		int num = 0;
		if (orderNumber1 > orderNumber2 && orderNumber1 > orderNumber3)
		{
			num = orderNumber1;
		}
		else if (orderNumber2 > orderNumber1 && orderNumber2 > orderNumber3)
		{
			num = orderNumber2;
		}
		else if (orderNumber3 > orderNumber1 && orderNumber3 > orderNumber2)
		{
			num = orderNumber3;
		}
		assertEquals(b.getCurrentOrder().getOrderNo(), num);
	}

	@Test
	void testListOfOrders() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		int orderNumber = b.getCurrentOrder().generateOrder();
		b.getCurrentOrder().addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.LARGE);
		b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 1, false);
		assertEquals(b.listOfOrders(), "" + orderNumber + ",8,MONDAY,John,20,Coffee1,MEDIUM,true,false,3.5,Alcohol1,LARGE,false,4.0,Smoothie1,SMALL,false,1,2.5");
	}

	@Test
	void testToString() {
		b.startNewOrder(8, Day.MONDAY, "John", 20);
		int orderNumber = b.getCurrentOrder().generateOrder();
		b.getCurrentOrder().addNewBeverage("Coffee1", Size.MEDIUM, true, false);
		b.getCurrentOrder().addNewBeverage("Alcohol1", Size.LARGE);
		b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 1, false);
		assertEquals(b.toString(), "" + orderNumber + ",8,MONDAY,John,20,Coffee1,MEDIUM,true,false,3.5,Alcohol1,LARGE,false,4.0,Smoothie1,SMALL,false,1,2.5,10.0");
	}

}
