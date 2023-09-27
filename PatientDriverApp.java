import java.text.DecimalFormat;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Class named PatientDriverApp that creates an instance of the Patient Class, initialized with sample data. Then, create three instances of the Procedure class, using one of each Constructor. There are three methods.
 * Due: 09/27/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class PatientDriverApp {

	public static void main(String[] args) {
		
		//Patient Object
		Patient p = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "123-456-7890", "Bill Santori", "777-555-1212");
		displayPatient(p);
		
		// Procedure Objects
		Procedure p1 = new Procedure();
		p1.setProcedureName("Physical Exam");
		p1.setProcedureDate("7/20/2019");
		p1.setPractitionerName("Dr. Irvine");
		p1.setCharges(3250.0);
		p1.getProcedureName();
		p1.getProcedureDate();
		p1.getPractitionerName();
		p1.getCharges();
		displayProcedure(p1);
		
		Procedure p2 = new Procedure("X-Ray", "7/20/2019");
		p2.setPractitionerName("Dr. Jamison");
		p2.setCharges(5500.43);
		p2.getPractitionerName();
		p2.getCharges();
		displayProcedure(p2);
		
		Procedure p3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
		displayProcedure(p3);
		
		String totalCharges = calculateTotalCharges(p1, p2, p3);
		System.out.println("\nTotal Charges: $" + totalCharges);
		System.out.println("\nStudent Name: Kevin Villegas\nMC#: M21115032\nDue Date: 09/27/2023");
	}
	/**
	 * Takes a patient as parameter and displays the patients information.
	 * @param p a Patient Object
	 */
	public static void displayPatient(Patient p)
	{
		System.out.println(p.toString());
	}
	/**
	 * Takes a procedure as parameter and displays the procedure's information.
	 * @param p a Procedure Object
	 */
	public static void displayProcedure(Procedure p)
	{
		System.out.println(p.toString());
	}
	/**
	 * Takes three procedures as parameters and returns a String which is the total charges of the three procedures.
	 * @param a Procedure Object p1
	 * @param b Procedure Object p2
	 * @param c Procedure Object p3
	 * @return a String
	 */
	public static String calculateTotalCharges(Procedure a, Procedure b, Procedure c)
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		double totalCharges = a.getCharges() + b.getCharges() + c.getCharges();
		return df.format(totalCharges);
	}
}