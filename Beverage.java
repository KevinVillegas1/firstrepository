/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class that represents a Beverage Object.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public abstract class Beverage {
	private String bevName; 
	private Type type;
	private Size size;
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1.0;
	/**
	 * Creates a beverage object using given values.
	 * @param bevName - beverage name
	 * @param type - beverage type
	 * @param size - beverage size
	 */
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	/**
	 * Gets the base price
	 * @return the base price
	 */
	public double getBaseprice()
	{
		return this.BASE_PRICE;
	}
	/**
	 * Gets beverage type
	 * @return type of beverage
	 */
	public Type getType()
	{
		return this.type;
	}
	/**
	 * Gets the name of the beverage
	 * @return the beverage name
	 */
	public String getBevName()
	{
		return this.bevName;
	}
	/**
	 * Gets the size of the beverage
	 * @return size of the beverage
	 */
	public Size getSize()
	{
		return this.size;
	}
	/**
	 * Calculates a new price by adding the size price to the base price. There is no additional cost for small size, for medium and large beverages the additional cost of size price is added to base price.
	 * For example if the base price is 2 and SIZE_PRICE is .5 then the cost of small beverage is 2, the medium beverage is 2.5 and the large beverage is 3.
	 * @return A new price that by adding the size price to the base price
	 */
	public double addSizePrice()
	{
		double price = BASE_PRICE;
		if (this.size == Size.MEDIUM)
		{
			price += SIZE_PRICE;
		}
		if (this.size == Size.LARGE)
		{
			price += SIZE_PRICE + SIZE_PRICE;
		}
		return price;
	}
	/**
	 * Represents a Beverage object in String with the format of bevName,size
	 * @return the String representation of beverage
	 */
	public String toString()
	{
		return this.bevName + "," + this.size;
	}
	/**
	 * Checks if this Beverage equals to anotherBev
	 * @return true if the name, type, size , false otherwise
	 */
	@Override
	public boolean equals(Object anotherBev)
	{
		Beverage temp = (Beverage) anotherBev;
		if (this.bevName.equals(temp.bevName) && this.type == temp.type && this.size == temp.size)
			return true;
		return false;
	}
	/**
	 * Calculates the beverage price
	 * @return the price of the beverage
	 */
	public abstract double calcPrice();
}
