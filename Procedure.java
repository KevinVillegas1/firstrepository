/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Class named Procedure that has four fields for a procedure's information. There are three different Constructors, there are mutators and accessors for each attribute, and there is one method.
 * Due: 09/27/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Procedure {

	// Fields
	private String procedureName,procedureDate,practitionerName;
	private double charges;
	
	// Constructors

	/**
	 * no-arg Constructor
	 */
	public Procedure()
	{
			
	}
	/**
	 * Constructor that takes the procedure name and procedure date as input and sets them.
	 * @param a the name of the procedure
	 * @param b the date of the procedure
	 */
	public Procedure(String a, String b)
	{
		this.procedureName = a;
		this.procedureDate = b;
	}
	/**
	 * Constructor that takes the procedure name, procedure date, practitioner name, and charges of the procedure as input and sets them.
	 * @param a the name of the procedure
	 * @param b the date of the procedure
	 * @param c the name of the practitioner
	 * @param d the charges of the procedure
	 */
	public Procedure(String a, String b, String c, double d)
	{
		this.procedureName = a;
		this.procedureDate = b;
		this.practitionerName = c;
		this.charges = d;
	}
	
	// Mutators
	public void setProcedureName(String n)
	{
		this.procedureName = n;
	}
	public void setProcedureDate(String n)
	{
		this.procedureDate = n;
	}
	public void setPractitionerName(String n)
	{
		this.practitionerName = n;
	}
	public void setCharges(double c)
	{
		this.charges = c;
	}
	
	// Accessors
	public String getProcedureName()
	{
		return this.procedureName;
	}
	public String getProcedureDate()
	{
		return this.procedureDate;
	}
	public String getPractitionerName()
	{
		return this.practitionerName;
	}
	public double getCharges()
	{
		return this.charges;
	}
	
	// Method
	
	/**
	 * Returns a String which displays all information of a procedure, it uses the fields procedureName, procedureDate, practitionerName, and charges to display the information.
	 * @return a String
	 */
	public String toString()
	{
		return "\n\tProcedure: " + this.procedureName + "\n\tProcedure Date: " + this.procedureDate + "\n\tPractitioner: " + this.practitionerName + "\n\tCharge: " + this.charges;
	}
}