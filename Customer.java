/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class that represents a Customer Object.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Customer {
	private String name;
	private int age;
	/**
	 * Constructor for Customer
	 * @param name - name of the customer
	 * @param age - age of the customer
	 */
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	/**
	 * Copy constructor for Customer
	 * @param c - a Customer
	 */
	public Customer(Customer c)
	{
		this.name = c.getName();
		this.age = c.getAge();
	}
	/**
	 * get method for age
	 * @return the age
	 */
	public int getAge()
	{
		return this.age;
	}
	/**
	 * Set method for age
	 * @param age - returns the age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * get method for name
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * set method for name
	 * @param name - name of the customer
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * String representation of the customer includes the name and age of the customer.
	 * @return String containing the customer information
	 */
	@Override
	public String toString()
	{
		return this.name + "," + this.age;
	}
}
