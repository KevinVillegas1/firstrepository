/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Class named Patient that has ten fields for a patient's information. There are three different Constructors, there are mutators and accessors for each attribute, and there are four methods.
 * Due: 09/27/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Patient {
	
	// Fields
	private String firstName,middleName,lastName,streetAddress,city,state,zipCode,phoneNumber,emergencyName,emergencyPhone;
	
	// Constructors
	
	/**
	 * no-arg Constructor
	 */
	public Patient()
	{
		
	}
	/**
	 * Constructor that takes the first name, middle name, and last name of the patient as input and sets them.
	 * @param a the first name of the patient
	 * @param b the middle name of the patient
	 * @param c the last name of the patient
	 */
	public Patient(String a, String b, String c)
	{
		this.firstName = a;
		this.middleName = b;
		this.lastName = c;
	}
	/**
	 * Constructor that takes data as input and sets them.
	 * @param a the first name of the patient
	 * @param b the middle name of the patient
	 * @param c the last name of the patient
	 * @param d the street address of the patient
	 * @param e the city of the patient
	 * @param f the state of the patient
	 * @param g the zipcode of the patient
	 * @param h the phone number of the patient
	 * @param i the emergency contact of the patient
	 * @param j the phone number of the emergency contact of the patient
	 */
	public Patient(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j)
	{
		this.firstName = a;
		this.middleName = b;
		this.lastName = c;
		this.streetAddress = d;
		this.city = e;
		this.state = f;
		this.zipCode = g;
		this.phoneNumber = h;
		this.emergencyName = i;
		this.emergencyPhone = j;
	}
	
	// Mutators
	public void setFirstName(String n)
	{
		this.firstName = n;
	}
	public void setMiddleName(String n)
	{
		this.middleName = n;
	}
	public void setLastName(String n)
	{
		this.lastName = n;
	}
	public void setStreetAddress(String n)
	{
		this.streetAddress = n;
	}
	public void setCity(String n)
	{
		this.city = n;
	}
	public void setState(String n)
	{
		this.state = n;
	}
	public void setZipCode(String a)
	{
		this.zipCode = a;
	}
	public void setPhoneNumber(String n)
	{
		this.phoneNumber = n;
	}
	public void setEmergencyName(String n)
	{
		this.emergencyName = n;
	}
	public void setEmergencyPhone(String n)
	{
		this.emergencyPhone = n;
	}
	
	// Accessors
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getMiddleName()
	{
		return this.middleName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getStreetAddress()
	{
		return this.streetAddress;
	}
	public String getCity()
	{
		return this.city;
	}
	public String getState()
	{
		return this.state;
	}
	public String getZipCode()
	{
		return this.zipCode;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	public String getEmergencyName()
	{
		return this.emergencyName;
	}
	public String getEmergencyPhone()
	{
		return this.emergencyPhone;
	}
	
	// Methods
	
	/**
	 * Returns a String which is the concatenation of first, middle, and last name separated by space.
	 * @return a String
	 */
	public String buildFullName()
	{
		return (firstName + " " + middleName + " " + lastName);
	}
	/**
	 * Returns a String which is the concatenation of address, city, state, and zipcode separated by space.
	 * @return a String
	 */
	public String buildAddress()
	{
		return (streetAddress + " " + city + " " + state + " " + zipCode);
	}
	/**
	 * Returns a String which is the concatenation of emergency name and emergency phone separated by space.
	 * @return a String
	 */
	public String buildEmergencyContact()
	{
		return (emergencyName + " " + emergencyPhone);
	}
	/**
	 * Returns a String which displays all information of a patient, it uses the methods buildFullName, buildAddress, and buildEmergencyContact to display the information.
	 * @return a String
	 */
	public String toString()
	{
		return "Patient info:\n  Name: " + this.buildFullName() + "\n  Address: " + this.buildAddress() + "\n  Emergency Contact: " + this.buildEmergencyContact();
	}
}