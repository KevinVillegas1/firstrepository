/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Class that contains instance variables for a Management Company, this class will contain methods that add properties and gets information about the Management Company and the properties.
 * It will also contain a toString that displays information about the all the properties in the Management Company.
 * Due: 11/07/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class ManagementCompany extends Property {
	private String managementCompanyName, taxID;
	private double mgmFeePer;
	private Plot plot;
	private Property properties[];
	private int numberOfProperties;
	private double totalMgmFee;
	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_WIDTH = 10;
	public static final int MGMT_DEPTH = 10;
	
	public ManagementCompany() {
		this.managementCompanyName = "";
		this.taxID = "";
		this.mgmFeePer = 0.0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.managementCompanyName = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.managementCompanyName = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(ManagementCompany otherCompany) {
		this.managementCompanyName = otherCompany.getName();
		this.taxID = otherCompany.getTaxID();
		this.mgmFeePer = otherCompany.getMgmFeePer();
		this.plot = new Plot(otherCompany.getPlot());
		this.properties = new Property[MAX_PROPERTY];
	}
	public int addProperty(String name, String city, double rent, String owner) {
		Property p = new Property(name, city, rent, owner);
		int index = 0;
		if (isPropertiesFull() == true)
		{
			return -1;
		}
		if (p.equals(null))
		{
			return -2;
		}
		if (this.plot.encompasses(p.getPlot()) == false)
		{
			return -3;
		}
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				if (properties[i].getPlot().overlaps(p.getPlot()))
				{
					return -4;
				}
			}
		}
		if (properties[index] == null)
		{
			properties[index] = p;
		}
		else
		{
			while (properties[index] != null)
			{
				index++;
			}
			properties[index] = p;
		}
		this.numberOfProperties++;
		this.totalMgmFee += ((this.mgmFeePer * p.getRentAmount()) / 100);
		return index;
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property p = new Property(name, city, rent, owner, x, y, width, depth);
		int index = 0;
		if (isPropertiesFull() == true)
		{
			return -1;
		}
		if (p.equals(null))
		{
			return -2;
		}
		if (this.plot.encompasses(p.getPlot()) == false)
		{
			return -3;
		}
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				if (properties[i].getPlot().overlaps(p.getPlot()))
				{
					return -4;
				}
			}
		}
		if (properties[index] == null)
		{
			properties[index] = p;
		}
		else
		{
			while (properties[index] != null)
			{
				index++;
			}
			properties[index] = p;
		}
		this.numberOfProperties++;
		this.totalMgmFee += ((this.mgmFeePer * p.getRentAmount()) / 100);
		return index;
	}
	public int addProperty(Property property) {
		Property p = new Property(property);
		int index = 0;
		if (isPropertiesFull() == true)
		{
			return -1;
		}
		if (p.equals(null))
		{
			return -2;
		}
		if (this.plot.encompasses(p.getPlot()) == false)
		{
			return -3;
		}
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				if (properties[i].getPlot().overlaps(p.getPlot()))
				{
					return -4;
				}
			}
		}
		if (properties[index] == null)
		{
			properties[index] = p;
		}
		else
		{
			while (properties[index] != null)
			{
				index++;
			}
			properties[index] = p;
		}
		this.numberOfProperties++;
		this.totalMgmFee += ((this.mgmFeePer * p.getRentAmount()) / 100);
		return index;
	}
	public void removeLastProperty() {
		int index = 4;
		if (properties[index] != null)
		{
			properties[index] = null;
			this.numberOfProperties--;
		}
		else
		{
			while (properties[index] == null)
			{
				index--;
			}
			properties[index] = null;
			this.numberOfProperties--;
		}
	}
	public boolean isPropertiesFull() {
		int count = 0;
		for(int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				count++;
			}
		}
		if (count == MAX_PROPERTY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int getPropertiesCount() {
		return this.numberOfProperties;
	}
	public double getTotalRent() {
		double totalRent = 0.0;
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				totalRent += properties[i].getRentAmount();
			}
		}
		return totalRent;
	}
	public Property getHighestRentProperty() {
		double highestRent = properties[0].getRentAmount();
		int j = 0;
		for (int i = 1; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				if ((properties[i].getRentAmount()) > highestRent)
				{
					highestRent = properties[i].getRentAmount();
					j = i;
				}
			}
			
		}
		return properties[j];
	}
	public boolean isManagementFeeValid() {
		if (this.mgmFeePer >= 0 && this.mgmFeePer <= 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String listOfProperties() {
		String list = "";
		for (int i = 0; i < numberOfProperties; i++)
		{
			list += properties[i].toString() + "\n";
		}
		return list;
	}
	public String getName() {
		return this.managementCompanyName;
	}
	public String getTaxID() {
		return this.taxID;
	}
	public Property[] getProperties() {
		return this.properties;
	}
	public double getMgmFeePer() {
		return this.mgmFeePer;
	}
	public Plot getPlot() {
		return this.plot;
	}
	public String toString() {
		return "List of the properties for " + this.managementCompanyName + ", taxID: " + this.taxID + "\n"
		+ "______________________________________________________\n"
		+ listOfProperties()
		+ "______________________________________________________\n"
		+"\n"
		+ " total management Fee: " + this.totalMgmFee;
	}
}
