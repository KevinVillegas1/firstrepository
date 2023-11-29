import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Junit test class that has a test method for each public method of the TwoDimRaggedArrayUtility class. 
 * It will test to make sure all the methods in the class work properly.
 * Due: 11/28/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] data1 = {{1,2,3},{4,5},{6,7,8}};
	private double[][] data2 = {{7,2,9,4},{5},{8,1,3},{11,6,7,2}};
	private double[][] data3 = {{7.2,2.5,9.3,4.8},{5.9},{8.1,1.7,3.3},{11.6,6.9,7.3,2.7}};
	private double[][] data4 = {{-2.5,-5.3,6.1},{-4.4,8.2},{2.3,-7.5},{-4.2,7.3,-5.9,2.6}};
	private double[][] data5 = {{1.65,4.50,2.36,7.45,3.44,6.23},{2.22,-3.24,-1.66,-5.48,3.46},{4.23,2.29,5.29},{2.76,3.76,4.29,5.48,3.43},{3.38,3.65,3.76},{2.46,3.34,2.38,8.26,5.34}};
	private double[][] data6 = {{1253.65,4.50,2154.36,7532.45,3388.44},{2876.22,-3.24,1954.66},{4896.23,2.29,5499.29},{2256.76,3.76,4286.29,5438.48,3794.43},{3184.38,3654.65,3455.76,6387.23,4265.77,4592.45},{2657.46,3265.34,2256.38,8935.26,5287.34,6598.23}};
	private double[][] data7 = {{12536.54,45665.05,21543.66,75324.57,33884.48,65982.39},{28762.21,35762.42,19546.63},{48962.34,28552.95,23863.66,54992.97},{22567.63,36237.64,42862.95,54384.86,37944.37},{31843.86,36546.57,34557.68,63872.39,42657.70,45924.51},{26574.65,32653.46,22563.87,89352.68,52873.49}};
	private double[][] data8 = {{7,9,3,8},{4,6},{5},{1,3,9,10,2}};
	private double[][] data9 = {{-1.1,2.8},{3.9},{4.5,6.7,-8.9,6.4},{-7.1,9.5},{6.3,-7.6,-9.4,2.7,8.8}};
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAverage() {
		assertEquals(4.5,TwoDimRaggedArrayUtility.getAverage(data1),.001);
		assertEquals(5.41666666667,TwoDimRaggedArrayUtility.getAverage(data2),.001);
		assertEquals(5.94166666667,TwoDimRaggedArrayUtility.getAverage(data3),.001);
		assertEquals(-0.3,TwoDimRaggedArrayUtility.getAverage(data4),.001);
		assertEquals(3.14925925926,TwoDimRaggedArrayUtility.getAverage(data5),.001);
		assertEquals(3567.10071429,TwoDimRaggedArrayUtility.getAverage(data6),.001);
		assertEquals(40303.3855172,TwoDimRaggedArrayUtility.getAverage(data7),.001);
		assertEquals(5.58333333,TwoDimRaggedArrayUtility.getAverage(data8),.001);
		assertEquals(1.25,TwoDimRaggedArrayUtility.getAverage(data9),.001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(11.0,TwoDimRaggedArrayUtility.getColumnTotal(data1,0),.001);
		assertEquals(9.0,TwoDimRaggedArrayUtility.getColumnTotal(data2,1),.001);
		assertEquals(19.9,TwoDimRaggedArrayUtility.getColumnTotal(data3,2),.001);
		assertEquals(2.6,TwoDimRaggedArrayUtility.getColumnTotal(data4,3),.001);
		assertEquals(15.67,TwoDimRaggedArrayUtility.getColumnTotal(data5,4),.001);
		assertEquals(11190.68,TwoDimRaggedArrayUtility.getColumnTotal(data6,5),.001);
		assertEquals(111906.9,TwoDimRaggedArrayUtility.getColumnTotal(data7,5),.001);
		assertEquals(12.0,TwoDimRaggedArrayUtility.getColumnTotal(data8,2),.001);
		assertEquals(9.1,TwoDimRaggedArrayUtility.getColumnTotal(data9,3),.001);
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(8.0,TwoDimRaggedArrayUtility.getHighestInArray(data1),.001);
		assertEquals(11.0,TwoDimRaggedArrayUtility.getHighestInArray(data2),.001);
		assertEquals(11.6,TwoDimRaggedArrayUtility.getHighestInArray(data3),.001);
		assertEquals(8.2,TwoDimRaggedArrayUtility.getHighestInArray(data4),.001);
		assertEquals(8.26,TwoDimRaggedArrayUtility.getHighestInArray(data5),.001);
		assertEquals(8935.26,TwoDimRaggedArrayUtility.getHighestInArray(data6),.001);
		assertEquals(89352.68,TwoDimRaggedArrayUtility.getHighestInArray(data7),.001);
		assertEquals(10.0,TwoDimRaggedArrayUtility.getHighestInArray(data8),.001);
		assertEquals(9.5,TwoDimRaggedArrayUtility.getHighestInArray(data9),.001);
	}

	@Test
	void testGetHighestInColumn() {
		assertEquals(6.0,TwoDimRaggedArrayUtility.getHighestInColumn(data1,0),.001);
		assertEquals(6.0,TwoDimRaggedArrayUtility.getHighestInColumn(data2,1),.001);
		assertEquals(9.3,TwoDimRaggedArrayUtility.getHighestInColumn(data3,2),.001);
		assertEquals(2.6,TwoDimRaggedArrayUtility.getHighestInColumn(data4,3),.001);
		assertEquals(5.34,TwoDimRaggedArrayUtility.getHighestInColumn(data5,4),.001);
		assertEquals(6598.23,TwoDimRaggedArrayUtility.getHighestInColumn(data6,5),.001);
		assertEquals(65982.39,TwoDimRaggedArrayUtility.getHighestInColumn(data7,5),.001);
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInColumn(data8,2),.001);
		assertEquals(6.4,TwoDimRaggedArrayUtility.getHighestInColumn(data9,3),.001);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data1,0),.001);
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data2,1),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data3,2),.001);
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data4,3),.001);
		assertEquals(5,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data5,4),.001);
		assertEquals(5,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data6,5),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data7,5),.001);
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data8,2),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(data9,3),.001);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(3.0,TwoDimRaggedArrayUtility.getHighestInRow(data1,0),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInRow(data2,1),.001);
		assertEquals(8.1,TwoDimRaggedArrayUtility.getHighestInRow(data3,2),.001);
		assertEquals(7.3,TwoDimRaggedArrayUtility.getHighestInRow(data4,3),.001);
		assertEquals(3.76,TwoDimRaggedArrayUtility.getHighestInRow(data5,4),.001);
		assertEquals(8935.26,TwoDimRaggedArrayUtility.getHighestInRow(data6,5),.001);
		assertEquals(89352.68,TwoDimRaggedArrayUtility.getHighestInRow(data7,5),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInRow(data8,2),.001);
		assertEquals(9.5,TwoDimRaggedArrayUtility.getHighestInRow(data9,3),.001);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInRowIndex(data1,0),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(data2,1),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(data3,2),.001);
		assertEquals(1,TwoDimRaggedArrayUtility.getHighestInRowIndex(data4,3),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInRowIndex(data5,4),.001);
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInRowIndex(data6,5),.001);
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInRowIndex(data7,5),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(data8,2),.001);
		assertEquals(1,TwoDimRaggedArrayUtility.getHighestInRowIndex(data9,3),.001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(data1),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(data2),.001);
		assertEquals(1.7,TwoDimRaggedArrayUtility.getLowestInArray(data3),.001);
		assertEquals(-7.5,TwoDimRaggedArrayUtility.getLowestInArray(data4),.001);
		assertEquals(-5.48,TwoDimRaggedArrayUtility.getLowestInArray(data5),.001);
		assertEquals(-3.24,TwoDimRaggedArrayUtility.getLowestInArray(data6),.001);
		assertEquals(12536.54,TwoDimRaggedArrayUtility.getLowestInArray(data7),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(data8),.001);
		assertEquals(-9.4,TwoDimRaggedArrayUtility.getLowestInArray(data9),.001);
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInColumn(data1,0),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInColumn(data2,1),.001);
		assertEquals(3.3,TwoDimRaggedArrayUtility.getLowestInColumn(data3,2),.001);
		assertEquals(2.6,TwoDimRaggedArrayUtility.getLowestInColumn(data4,3),.001);
		assertEquals(3.43,TwoDimRaggedArrayUtility.getLowestInColumn(data5,4),.001);
		assertEquals(4592.45,TwoDimRaggedArrayUtility.getLowestInColumn(data6,5),.001);
		assertEquals(45924.51,TwoDimRaggedArrayUtility.getLowestInColumn(data7,5),.001);
		assertEquals(3.0,TwoDimRaggedArrayUtility.getLowestInColumn(data8,2),.001);
		assertEquals(2.7,TwoDimRaggedArrayUtility.getLowestInColumn(data9,3),.001);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data1,0),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data2,1),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data3,2),.001);
		assertEquals(3,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data4,3),.001);
		assertEquals(3,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data5,4),.001);
		assertEquals(4,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data6,5),.001);
		assertEquals(4,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data7,5),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data8,2),.001);
		assertEquals(4,TwoDimRaggedArrayUtility.getLowestInColumnIndex(data9,3),.001);
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInRow(data1,0),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getLowestInRow(data2,1),.001);
		assertEquals(1.7,TwoDimRaggedArrayUtility.getLowestInRow(data3,2),.001);
		assertEquals(-5.9,TwoDimRaggedArrayUtility.getLowestInRow(data4,3),.001);
		assertEquals(3.38,TwoDimRaggedArrayUtility.getLowestInRow(data5,4),.001);
		assertEquals(2256.38,TwoDimRaggedArrayUtility.getLowestInRow(data6,5),.001);
		assertEquals(22563.87,TwoDimRaggedArrayUtility.getLowestInRow(data7,5),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getLowestInRow(data8,2),.001);
		assertEquals(-7.1,TwoDimRaggedArrayUtility.getLowestInRow(data9,3),.001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(data1,0),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(data2,1),.001);
		assertEquals(1,TwoDimRaggedArrayUtility.getLowestInRowIndex(data3,2),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInRowIndex(data4,3),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(data5,4),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInRowIndex(data6,5),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInRowIndex(data7,5),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(data8,2),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(data9,3),.001);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(6.0,TwoDimRaggedArrayUtility.getRowTotal(data1,0),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getRowTotal(data2,1),.001);
		assertEquals(13.1,TwoDimRaggedArrayUtility.getRowTotal(data3,2),.001);
		assertEquals(-0.2,TwoDimRaggedArrayUtility.getRowTotal(data4,3),.001);
		assertEquals(10.79,TwoDimRaggedArrayUtility.getRowTotal(data5,4),.001);
		assertEquals(29000.01,TwoDimRaggedArrayUtility.getRowTotal(data6,5),.001);
		assertEquals(84071.26,TwoDimRaggedArrayUtility.getRowTotal(data7,1),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getRowTotal(data8,2),.001);
		assertEquals(2.4,TwoDimRaggedArrayUtility.getRowTotal(data9,3),.001);
	}

	@Test
	void testGetTotal() {
		assertEquals(36.0,TwoDimRaggedArrayUtility.getTotal(data1),.001);
		assertEquals(65.0,TwoDimRaggedArrayUtility.getTotal(data2),.001);
		assertEquals(71.3,TwoDimRaggedArrayUtility.getTotal(data3),.001);
		assertEquals(-3.3,TwoDimRaggedArrayUtility.getTotal(data4),.001);
		assertEquals(85.03,TwoDimRaggedArrayUtility.getTotal(data5),.001);
		assertEquals(99878.82,TwoDimRaggedArrayUtility.getTotal(data6),.001);
		assertEquals(1168798.18,TwoDimRaggedArrayUtility.getTotal(data7),.001);
		assertEquals(67.0,TwoDimRaggedArrayUtility.getTotal(data8),.001);
		assertEquals(17.5,TwoDimRaggedArrayUtility.getTotal(data9),.001);
	}

	@Test
	void testReadFile() {
		File file1 = new File("data1.txt");
		File file2 = new File("writeData1.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file1), file2);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file1),TwoDimRaggedArrayUtility.readFile(file2));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file3 = new File("data2.txt");
		File file4 = new File("writeData2.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file3), file4);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file3),TwoDimRaggedArrayUtility.readFile(file4));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file5 = new File("data3.txt");
		File file6 = new File("writeData3.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file5), file6);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file5),TwoDimRaggedArrayUtility.readFile(file6));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file7 = new File("data4.txt");
		File file8 = new File("writeData4.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file7), file8);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file7),TwoDimRaggedArrayUtility.readFile(file8));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file9 = new File("data5.txt");
		File file10 = new File("writeData5.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file9), file10);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file9),TwoDimRaggedArrayUtility.readFile(file10));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file11 = new File("data6.txt");
		File file12 = new File("writeData6.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file11), file12);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file11),TwoDimRaggedArrayUtility.readFile(file12));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file13 = new File("data7.txt");
		File file14 = new File("writeData7.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file13), file14);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file13),TwoDimRaggedArrayUtility.readFile(file14));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file15 = new File("data8.txt");
		File file16 = new File("writeData8.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file15), file16);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file15),TwoDimRaggedArrayUtility.readFile(file16));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file17 = new File("data9.txt");
		File file18 = new File("writeData9.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(TwoDimRaggedArrayUtility.readFile(file17), file18);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		try {
			assertArrayEquals(TwoDimRaggedArrayUtility.readFile(file17),TwoDimRaggedArrayUtility.readFile(file18));
	    } catch (FileNotFoundException e) {
			System.out.println("File Does Not Exist");
		}
		
	}

	@Test
	void testWriteToFile() {
		File file1 = new File("Test1.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data1, file1);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file2 = new File("Test2.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data2, file2);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file3 = new File("Test3.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data3, file3);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file4 = new File("Test4.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data4, file4);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file5 = new File("Test5.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data5, file5);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file6 = new File("Test6.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data6, file6);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file7 = new File("Test7.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data7, file7);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file8 = new File("Test8.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data8, file8);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
		File file9 = new File("Test9.txt");
		try {
			TwoDimRaggedArrayUtility.writeToFile(data9, file9);
		} catch (IOException e) {
			System.out.println("File Does Not Exist");
		}
		
	}

}
