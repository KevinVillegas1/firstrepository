/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Class that contains instance variables for property name, city, rental amount, owner, and plot. 
 * Create methods to get information about the property. Create a toString method to display the property's information.
 * as well as a toString method to display the plot's information. 
 * Due: 11/07/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Property extends Plot {
	private String propertyName, city, owner;
	private double rentAmount;
	private Plot plot;
	
	public Property() {
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.rentAmount = 0.0;
		this.plot = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x,y,width,depth);
	}
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.getPropertyName();
		this.city = otherProperty.getCity();
		this.owner = otherProperty.getOwner();
		this.rentAmount = otherProperty.getRentAmount();
		this.plot = new Plot(otherProperty.getPlot());
	}
	public String getCity() {
		return this.city;
	}
	public String getOwner() {
		return this.owner;
	}
	public Plot getPlot() {
		return this.plot;
	}
	public String getPropertyName() {
		return this.propertyName;
	}
	public double getRentAmount() {
		return this.rentAmount;
	}
	public String toString() {
		return this.propertyName + "," + this.city + "," + this.owner + "," + this.rentAmount;
	}
}
