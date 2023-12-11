import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class that represents a BevShop Object.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class BevShop implements BevShopInterface{
	private int numOfAlcoholDrinksForCurrentOrder;
	public ArrayList <Order> orders = new ArrayList<Order>();
	/**
	 * default Constructor Initializes a BevShop Object
	 */
	public BevShop()
	{
		
	}
	/**
	 * Checks if the time is valid (between 8 and 23 )
	 * @param time - time represents the time
	 * @return true if times is within the range of 8 to 23 , false otherwise
	 */
	public boolean isValidTime(int time)
	{
		boolean valid = false;
		if (time >= MIN_TIME && time <= MAX_TIME)
		{
			valid = true;
		}
		return valid;
	}
	/**
	 * returns the constant value for the Maximum number of fruits that this shop offers for SMOOTHIE beverage
	 * @return the value for the Maximum number of fruits that this shop offers for SMOOTHIE beverage
	 */
	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}
	/**
	 * returns the constant value for the Maximum age for offering Alcohol drink
	 * @return returns the value for the minimum age for offering Alcohol drink
	 */
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	/**
	 * returns true if the passed parameter exceeds the Maximum FRUIT allowed
	 * @param numOfFruits - number of fruits
	 * @return true if the passed parameter exceeds the MAXIUM number of fruits allowed for the SMOTHIE drink, false otherwise
	 */
	public boolean isMaxFruit(int numOfFruits)
	{
		boolean maxFruit = false;
		if (numOfFruits > MAX_FRUIT)
		{
			maxFruit = true;
		}
		return maxFruit;
	}
	/**
	 * returns constant maximum number of alcohol beverages/per order offered by the beverage shop
	 * @return constant maximum number of alcohol beverages/per order offered by the beverage shop
	 */
	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	/**
	 * checks if the number of alcohol beverages for the current order has reached the maximum
	 * @return true if number of alcohol drinks for the current order has reached the maximum , false otherwise
	 */
	public boolean isEligibleForMore()
	{
		if (getNumOfAlcoholDrink() >= MAX_ORDER_FOR_ALCOHOL)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * returns the number of alcohol drinks for the current order
	 * @return returns the number of alcohol drinks for the current order
	 */
	public int getNumOfAlcoholDrink()
	{
		this.numOfAlcoholDrinksForCurrentOrder = getCurrentOrder().findNumOfBeveType(Type.ALCOHOL);
		return this.numOfAlcoholDrinksForCurrentOrder;
	}
	/**
	 * check the valid age for the alcohol drink
	 * @param age - the age
	 * @return returns true if age is more than minimum eligible age , false otherwise
	 */
	public boolean isValidAge(int age)
	{
		if (age >= MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}
	/**
	 * Creates a new order , NO BEVERAGE is added to the order yet
	 * @param time - time of the order
	 * @param day - day of the order of type DAY
	 * @param customerName - customer name
	 * @param customerAge - customer age
	 */
	public void startNewOrder(int time, Day day, String customerName, int customerAge)
	{
		orders.add(new Order(time, day, new Customer(customerName, customerAge)));
	}
	/**
	 * process the Coffee order for the current order by adding it to the current order
	 * @param bevName - beverage name
	 * @param size - beverage size
	 * @param extraShot - true if the coffee beverage has extra shot , false otherwise
	 * @param extraSyrup - true if the coffee beverage has extra syrup , false otherwise
	 */
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	/**
	 * process the Alcohol order for the current order by adding it to the current order
	 * @param bevName - beverage name
	 * @param size - beverage size
	 */
	public void processAlcoholOrder(String bevName, Size size)
	{
		getCurrentOrder().addNewBeverage(bevName, size);
	}
	/**
	 * process the Smoothie order for the current order by adding it to the current order
	 * @param bevName - beverage name
	 * @param size - beverage size
	 * @param numOfFruits - number of fruits to be added
	 * @param addProtein - true if protein is added , false otherwise
	 */
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	/**
	 * locate an order based on the order number
	 * @param orderNo - the order number
	 * @return the index of the order in the list of Orders if found or -1 if not found
	 */
	public int findOrder(int orderNo)
	{
		for (Order o : orders)
		{
			if (o.getOrderNo() == orderNo)
			{
				return orders.indexOf(o);
			}
		}
		return -1;
	}
	/**
	 * locates an order in the list of orders and returns the total value on the order.
	 * @param orderNo - the order number
	 * @return the calculated price on this order.
	 */
	public double totalOrderPrice(int orderNo)
	{
		int index = findOrder(orderNo);
		double totalPrice = orders.get(index).calcOrderTotal();
		return totalPrice;
	}
	/**
	 * Calculates the total sale of all the orders for this beverage shop
	 * @return the total sale of all the orders
	 */
	public double totalMonthlySale()
	{
		double totalSale = 0.0;
		for (Order o : orders)
		{
			totalSale += totalOrderPrice(o.getOrderNo());
		}
		return totalSale;
	}
	/**
	 * returns total numbers of orders within the month
	 * @return total numbers of orders within the month
	 */
	public int totalNumOfMonthlyOrders()
	{
		int totalNum = orders.size();
		return totalNum;
	}
	/**
	 * returns the current Order located in the index in the list of orders. Notes: this method returns the shallow copy of the order
	 * @return the current order
	 */
	public Order getCurrentOrder()
	{
		Order o = orders.get(orders.size() - 1);
		return o;
	}
	/**
	 * returns Order in the list of orders at the index Notes: this method returns the shallow copy of the order
	 * @param index - the order index
	 * @return Order in the list of orders at the index
	 */
	public Order getOrderAtIndex(int index)
	{
		return orders.get(index);
	}
	/**
	 * sorts the orders within this bevShop using the Selection sort algorithm
	 */
	public void sortOrders()
	{
	    int startScan, index, minIndex, minValue;
	    for (startScan = 0; startScan < (orders.size() - 1); startScan++)
	    {
	    	minIndex = startScan;
	        minValue = orders.get(startScan).getOrderNo();
	        for (index = startScan + 1; index < orders.size(); index++)
	        {
	            if (orders.get(index).getOrderNo() < minValue)
	            {
	                minValue = orders.get(index).getOrderNo();
	                minIndex = index;                    
	            }
	        }
	        if (startScan != minIndex)
	        {
	            Order temp = orders.get(minIndex);
	            orders.set(minIndex, orders.get(startScan));
	            orders.set(startScan, temp);
	        }
	    }
	}
	/**
	 * A string representation of the list of orders
	 * @return a string representation of the list of orders
	 */
	public String listOfOrders()
	{
		String string = "";
		for (Order o : orders)
		{
			string += o.toString();
		}
		return string;
	}
	/**
	 * returns the string representation of all the orders and the total monthly sale
	 * @return returns the information of all the orders
	 */
	@Override
	public String toString()
	{
		return listOfOrders() + "," + totalMonthlySale();
	}
}
