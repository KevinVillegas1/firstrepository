import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the ManagementCompany class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 11/07/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class ManagementCompanyTestStudent {
	Property sampleProperty;
	ManagementCompany managementCompany;

	@BeforeEach
	void setUp() throws Exception {
		managementCompany = new ManagementCompany("MGM Company", "123456789",7);
	}

	@AfterEach
	void tearDown() throws Exception {
		managementCompany = null;
	}

	@Test
	void testAddPropertyStringStringDoubleString() {
		assertEquals(managementCompany.addProperty("Resort", "Orlando", 4570, "John Smith"),0,0);
	}

	@Test
	void testAddPropertyStringStringDoubleStringIntIntIntInt() {
		assertEquals(managementCompany.addProperty("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2),1,1);
	}

	@Test
	void testAddPropertyProperty() {
		sampleProperty = new Property ("Post Office", "Austin", 3450, "George Miller");		 
		assertEquals(managementCompany.addProperty(sampleProperty),2,2);
	}

	@Test
	void testRemoveLastProperty() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);		 
		assertEquals(managementCompany.addProperty(sampleProperty),0,0);
		assertEquals(managementCompany.getPropertiesCount(),1);
		managementCompany.removeLastProperty();
		assertEquals(managementCompany.getPropertiesCount(),0);
	}

	@Test
	void testIsPropertiesFull() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);		 
		assertEquals(managementCompany.addProperty(sampleProperty),0,0);
		assertFalse(managementCompany.isPropertiesFull());
	}

	@Test
	void testGetPropertiesCount() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);		 
		assertEquals(managementCompany.addProperty(sampleProperty),0,0);
		assertEquals(managementCompany.getPropertiesCount(), 1);
	}

	@Test
	void testGetTotalRent() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);		 
		assertEquals(managementCompany.addProperty(sampleProperty),0,0);	
		assertEquals(managementCompany.getTotalRent(), 6460.0);
	}

	@Test
	void testGetHighestRentProperty() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);		 
		assertEquals(managementCompany.addProperty(sampleProperty),0,0);
		System.out.println(managementCompany.getHighestRentProperty());
	}

	@Test
	void testIsManagementFeeValid() {
		assertTrue(managementCompany.isManagementFeeValid());
	}

	@Test
	void testListOfProperties() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);		 
		assertEquals(managementCompany.addProperty(sampleProperty),0,0);	
		assertEquals("Hotel,Seattle,Alan Rogers,6460.0\n", managementCompany.listOfProperties());
	}

	@Test
	void testGetName() {
		assertEquals("MGM Company", managementCompany.getName());
	}

	@Test
	void testGetTaxID() {
		assertEquals("123456789", managementCompany.getTaxID());
	}

	@Test
	void testGetProperties() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);		 
		assertEquals(managementCompany.addProperty(sampleProperty),0,0);
		for (int i = 0; i < managementCompany.getProperties().length; i++)
		{
			System.out.println(managementCompany.getProperties()[i]);
		}
	}

	@Test
	void testGetMgmFeePer() {
		assertEquals(7, managementCompany.getMgmFeePer());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, managementCompany.getPlot().getX());
		assertEquals(0, managementCompany.getPlot().getY());
		assertEquals(10, managementCompany.getPlot().getWidth());
		assertEquals(10, managementCompany.getPlot().getDepth());
	}

	@Test
	void testToString() {
		sampleProperty = new Property ("Hotel", "Seattle", 6460, "Alan Rogers",6,1,2,2);
		assertEquals(managementCompany.addProperty(sampleProperty), 0);
		String expectedString = "List of the properties for MGM Company, taxID: 123456789\n"
				+ "______________________________________________________\n"
				+ "Hotel,Seattle,Alan Rogers,6460.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 452.2";
		System.out.println(expectedString);
		System.out.println(managementCompany.toString());
		assertEquals(expectedString, managementCompany.toString());
	}

}
