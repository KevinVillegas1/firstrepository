/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class that represents Coffee Beverage.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Coffee extends Beverage{
	private boolean extraShot, extraSyrup;
	/**
	 * Creates a Coffee object using the given values
	 * @param bevName - beverage name
	 * @param size - beverage size
	 * @param extraShot - true if extra coffee shot added , false otherwise
	 * @param extraSyrup - true if extra syrup is added , false otherwise
	 */
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	/**
	 * Indicates whether or not extra shot is added
	 * @return extra shot
	 */
	public boolean getExtraShot()
	{
		return this.extraShot;
	}
	/**
	 * Indicates whether or not extra syrup is added
	 * @return extra syrup
	 */
	public boolean getExtraSyrup()
	{
		return this.extraSyrup;
	}
	/**
	 * Calculates the price based on base price, size, extra coffee shot and extra syrup
	 * @return the price of the coffee
	 */
	@Override
	public double calcPrice()
	{
		double price = addSizePrice();
		if (this.extraShot == true)
		{
			price += 0.5;
		}
		if (this.extraSyrup == true)
		{
			price += 0.5;
		}
		return price;
	}
	/**
	 * Represents a Coffee beverage in the following String format: name,size, whether it contains extra shot, extra syrup and the price
	 * @return String representation of a Coffee
	 */
	@Override
	public String toString()
	{
		return super.toString() + "," + this.extraShot + "," + this.extraSyrup + "," + calcPrice();
	}
	/**
	 * Checks if this Beverage equals to anotherBev
	 * @return true if the name, type, size and base price and whether or not it contains extra shot and extra syrup false otherwise
	 */
	@Override
	public boolean equals(Object anotherBev)
	{
		Coffee temp = (Coffee) anotherBev;
		if (super.equals(anotherBev) && this.extraShot == temp.extraShot && this.extraSyrup == temp.extraSyrup)
			return true;
		return false;
	}
}
