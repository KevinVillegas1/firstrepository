import java.util.ArrayList;
import java.util.Random;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class that represents a Order Object.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Order implements OrderInterface, Comparable<Order>{
	private int orderNo, orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList <Beverage> beverages = new ArrayList<Beverage>();
	/**
	 * Constructor for Order
	 * @param orderTime - time of the order (between 8 and 23)
	 * @param orderDay - day of the order
	 * @param cust - a customer object
	 */
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = cust;
	}
	/**
	 * Automatically generate order number
	 * @return a random order number between 10000 and 90000
	 */
	public int generateOrder()
	{
		Random rand = new Random();
		int min = 10000;
		int max = 90000;
		int randomNumber = rand.nextInt((max - min) + 1) + min;
		this.orderNo = randomNumber;
		return randomNumber;
	}
	/**
	 * returns the order number
	 * @return order number
	 */
	public int getOrderNo()
	{
		return this.orderNo;
	}
	/**
	 * returns the order time
	 * @return order time
	 */
	public int getOrderTime()
	{
		return this.orderTime;
	}
	/**
	 * returns the order day
	 * @return order day
	 */
	public Day getOrderDay()
	{
		return this.orderDay;
	}
	/**
	 * returns Customer
	 * @return a deep copy of Customer
	 */
	public Customer getCustomer()
	{
		Customer c = new Customer(this.customer);
		return c;
	}
	/**
	 * return order day (MONDAY, TUESDAY.....,SUNDAY)
	 * @return order day
	 */
	public Day getDay()
	{
		return this.orderDay;
	}
	/**
	 * Checks if the day is a weekend day
	 * @return true if the day is a weekend day (Saturday or Sunday)
	 */
	public boolean isWeekend()
	{
		if (this.orderDay == Day.SATURDAY || this.orderDay == Day.SUNDAY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * returns the beverage listed in the itemNo of the order, for example if itemNo is 0 this method will return the first beverage in this order
	 * Note: this method returns the shallow copy of the Beverage
	 * @return the beverage listed in the itemNo of the order or null if there is no item in the order
	 */
	public Beverage getBeverage(int itemNo)
	{
		Beverage beverage = beverages.get(itemNo);
		return beverage;
	}
	/**
	 * returns the total number of beverages ordered within this order
	 * @return total number of beverages ordered within this order
	 */
	public int getTotalItems()
	{
		int totalItems = beverages.size();
		return totalItems;
	}
	/**
	 * adds coffee order to this order
	 * @param bevName - beverage name
	 * @param size - beverage size of type SIZE
	 * @param extraShot - true if the coffee beverage has extra shot , false otherwise
	 * @param extraSyrup - true if the coffee beverage has extra syrup , false otherwise
	 */
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	/**
	 * adds alcohol order to this order
	 * @param bevName - beverage name
	 * @param size - beverage size
	 */
	public void addNewBeverage(String bevName, Size size)
	{
		beverages.add(new Alcohol(bevName, size, isWeekend()));
	}
	/**
	 * Adds the Smoothie beverage to this order
	 * @param bevName - beverage name
	 * @param size - beverage size
	 * @param numOfFruits - number of fruits added
	 * @param addProtein - true if protein is added, false otherwise
	 */
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	/**
	 * Calculates and returns the total amount for this order
	 * @return total amount for this order
	 */
	public double calcOrderTotal()
	{
		double sum = 0.0;
		for (Beverage b : beverages)
		{
			sum += b.calcPrice();
		}
		return sum;
	}
	/**
	 * returns the number of beverages of same type in an order
	 * @param type - the type of the beverage
	 * @return number of beverages of type type in this order
	 */
	public int findNumOfBeveType(Type type)
	{
		int count = 0;
		for (Beverage b : beverages)
		{
			if (b.getType() == type)
			{
				count++;
			}
		}
		return count;
	}
	/**
	 * String representation of list of beverages
	 * @return a String representation of list of beverages
	 */
	public String listOfBeverages()
	{
		String string = "";
		for (Beverage b : beverages)
		{
			string += "," + b.toString();
		}
		return string;
	}
	/**
	 * String representation of the order, Includes order number, time , day, customer name and age and the list of beverages
	 * @return a String representation of the order, Includes order number, time , day, customer name and age and the list of beverages
	 */
	@Override
	public String toString()
	{
		return this.orderNo + "," + this.orderTime + "," + this.orderDay + "," + this.customer.toString() + listOfBeverages();
	}
	/**
	 * Compares this order with another order based on the order number.
	 * @return 0 if this order number is same as another order's order number, 1 if it is greater than another order's order number, -1 if it smaller than another order's order number.
	 */
	@Override
	public int compareTo(Order anotherOrder)
	{
		return Integer.compare(this.orderNo, anotherOrder.orderNo);
	}
	
}
