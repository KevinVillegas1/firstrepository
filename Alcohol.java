/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class that represents Alcohol Beverage.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Alcohol extends Beverage{
	private boolean isWeekend;
	/**
	 * Creates an Alcohol object using given values
	 * @param bevName - beverage name
	 * @param size - beverage size
	 * @param isWeekend - whether the beverage is offered in the weekend false otherwise
	 */
	public Alcohol(String bevName, Size size, boolean isWeekend)
	{
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	/**
	 * Calculates the price of the alcohol
	 * @return the price of an alcohol beverage
	 */
	@Override
	public double calcPrice()
	{
		double price = addSizePrice();
		if (this.isWeekend == true)
		{
			price += 0.6;
		}
		return price;
	}
	/**
	 * String representation of Alcohol beverage, includes the name, size, whether or not beverage is offered in weekend and the price
	 * @return a string containing the information of an alcohol beverage
	 */
	@Override
	public String toString()
	{
		return super.toString() + "," + this.isWeekend + "," + calcPrice();
	}
	/**
	 * Checks if this Beverage equals to anotherBev
	 * @return true if the name, type, size and base price and whether beverage is offered in weekend or not are the same, false otherwise
	 */
	@Override
	public boolean equals(Object anotherBev)
	{
		Alcohol temp = (Alcohol) anotherBev;
		if (super.equals(anotherBev) && this.getBaseprice() == temp.getBaseprice() && this.isWeekend == temp.isWeekend)
			return true;
		return false;
	}
	/**
	 * Checks if is weekend.
	 * @return true, if is weekend
	 */
	public boolean isWeekend()
	{
		return this.isWeekend;
	}
}
