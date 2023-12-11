/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class that represents Smoothie Beverage.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Smoothie extends Beverage{
	private int numOfFruits;
	private boolean addProtein;
	/**
	 * Creates a Smoothie object using the given values
	 * @param bevName - Name of the beverage
	 * @param size - Size of the beverage
	 * @param numOfFruits - Number of fruits to be added to the smoothie
	 * @param addProtein - Whether to add protein to the smoothie or not
	 */
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	/**
	 * return number of fruits
	 * @return num of fruits
	 */
	public int getNumOfFruits()
	{
		return this.numOfFruits;
	}
	/**
	 * Indicates whether or not protein is added
	 * @return whether or not protein is added
	 */
	public boolean getAddProtein()
	{
		return this.addProtein;
	}
	/**
	 * returns the string representation of a Smoothie drink. Contains the name , size, whether or not protein added , number of fruits and price
	 * @return the string representation of a Smoothie drink.
	 */
	@Override
	public String toString()
	{
		return super.toString() + "," + this.addProtein + "," + this.numOfFruits + "," + calcPrice();
	}
	/**
	 * calculates the price of the Smoothie
	 * @return the price of the beverage
	 */
	@Override
	public double calcPrice()
	{
		double price = addSizePrice();
		if (this.addProtein == true)
		{
			price += 1.5;
		}
		price += (0.5 * this.numOfFruits);
		return price;
	}
	/**
	 * checks if this Beverage equals to anotherBev
	 * @return true if the name, type, size and base price, number of Fruits and add protein are the same, false otherwise
	 */
	@Override
	public boolean equals(Object anotherBev)
	{
		Smoothie temp = (Smoothie) anotherBev;
		if (super.equals(anotherBev) && this.numOfFruits == temp.numOfFruits && this.addProtein == temp.addProtein)
			return true;
		return false;
	}
}
