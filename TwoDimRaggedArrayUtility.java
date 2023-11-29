import java.io.*;
import java.util.Scanner;
/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a utility class that manipulates a two-dimensional ragged array of doubles.
 * Due: 11/28/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public final class TwoDimRaggedArrayUtility {
	
	public TwoDimRaggedArrayUtility()
	{
		
	}
	/**
	 * Returns the average of the elements in the two dimensional array
	 * @param data - the two dimensional array getting the average of
	 * @return the average of the elements in the two dimensional array(total of elements/number of elements)
	 */
	public static double getAverage(double[][] data)
	{
		double sum = 0;
		double count = 0;
		for (int row = 0; row < data.length; row++)
		{
			for(int column = 0; column < data[row].length; column++)
			{
				sum += data[row][column];
				count++;
			}
		}
		double average = (sum / count);
		return average;
	}
	/**
	 * Returns the total of the selected column in the two dimensional array index 0 refers to the first column.
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data - the two dimensional array
	 * @param col - the column index to take the total of (0 refers to the first column)
	 * @return the total of the column
	 */
	public static double getColumnTotal(double[][] data, int col)
	{
		double sum = 0.0;
		for (int row = 0; row < data.length; row++)
		{
			if (data[row].length > col)
			{
				sum += data[row][col];
			}
		}
		return sum;
	}
	/**
	 * Returns the largest element in the two dimensional array
	 * @param data - the two dimensional array
	 * @return the largest element in the two dimensional array
	 */
	public static double getHighestInArray(double[][] data)
	{
		double highest = Double.MIN_VALUE;
		for (int row = 0; row < data.length; row++)
		{
			for(int column = 0; column < data[row].length; column++)
			{
				if (data[row][column] > highest)
				{
					highest = data[row][column];
				}
			}
		}
		return highest;
	}
	/**
	 * Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the largest element of (0 refers to the first column)
	 * @return the largest element of the column
	 */
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highest = Double.MIN_VALUE;
		for (int row = 0; row < data.length; row++)
		{
			if (data[row].length > col)
			{
				if (data[row][col] > highest)
				{
					highest = data[row][col];
				}
			}
		}
		return highest;
	}
	/**
	 * Returns index of the largest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the largest element of (0 refers to the first column)
	 * @return the index of the largest element of the column
	 */
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		double highest = Double.MIN_VALUE;
		int index = 0;
		for (int row = 0; row < data.length; row++)
		{
			if (data[row].length > col)
			{
				if (data[row][col] > highest)
				{
					highest = data[row][col];
					index = row;
				}
			}
		}
		return index;
	}
	/**
	 * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the largest element of (0 refers to the first row)
	 * @return the largest element of the row
	 */
	public static double getHighestInRow(double[][] data, int row)
	{
		double highest = Double.MIN_VALUE;
		for(int column = 0; column < data[row].length; column++)
		{
			if (data[row][column] > highest)
			{
				highest = data[row][column];
			}
		}
		return highest;
	}
	/**
	 * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the largest element of (0 refers to the first row)
	 * @return the largest element of the row
	 */
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		double highest = Double.MIN_VALUE;
		int index = 0;
		for(int column = 0; column < data[row].length; column++)
		{
			if (data[row][column] > highest)
			{
				highest = data[row][column];
				index = column;
			}
		}
		return index;
	}
	/**
	 * Returns the smallest element in the two dimensional array
	 * @param data - the two dimensional array
	 * @return the smallest element in the two dimensional array
	 */
	public static double getLowestInArray(double[][] data)
	{
		double lowest = Double.MAX_VALUE;
		for (int row = 0; row < data.length; row++)
		{
			for(int column = 0; column < data[row].length; column++)
			{
				if (data[row][column] < lowest)
				{
					lowest = data[row][column];
				}
			}
		}
		return lowest;
	}
	/**
	 * Returns the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the smallest element of (0 refers to the first column)
	 * @return the smallest element of the column
	 */
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowest = Double.MAX_VALUE;
		for (int row = 0; row < data.length; row++)
		{
			if (data[row].length > col)
			{
				if (data[row][col] < lowest)
				{
					lowest = data[row][col];
				}
			}
		}
		return lowest;
	}
	/**
	 * Returns the index of the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the smallest element of (0 refers to the first column)
	 * @return the index of the smallest element of the column
	 */
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		double lowest = Double.MAX_VALUE;
		int index = 0;
		for (int row = 0; row < data.length; row++)
		{
			if (data[row].length > col)
			{
				if (data[row][col] < lowest)
				{
					lowest = data[row][col];
					index = row;
				}
			}
		}
		return index;
	}
	/**
	 * Returns the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the smallest element of (0 refers to the first row)
	 * @return the smallest element of the row
	 */
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowest = Double.MAX_VALUE;
		for(int column = 0; column < data[row].length; column++)
		{
			if (data[row][column] < lowest)
			{
				lowest = data[row][column];
			}
		}
		return lowest;
	}
	/**
	 * Returns the index of the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the smallest element of (0 refers to the first row)
	 * @return the index of the smallest element of the row
	 */
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		double lowest = Double.MAX_VALUE;
		int index = 0;
		for(int column = 0; column < data[row].length; column++)
		{
			if (data[row][column] < lowest)
			{
				lowest = data[row][column];
				index = column;
			}
		}
		return index;
	}
	/**
	 * Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to take the total of (0 refers to the first row)
	 * @return the total of the row
	 */
	public static double getRowTotal(double[][] data, int row)
	{
		double sum = 0.0;
		for(int column = 0; column < data[row].length; column++)
		{
			sum += data[row][column];
		}
		return sum;
	}
	/**
	 * Returns the total of all the elements of the two dimensional array
	 * @param data - the two dimensional array getting total of
	 * @return the sum of all the elements in the two dimensional array
	 */
	public static double getTotal(double[][] data)
	{
		double sum = 0.0;
		for (int row = 0; row < data.length; row++)
		{
			for(int column = 0; column < data[row].length; column++)
			{
				sum += data[row][column];
			}
		}
		return sum;
	}
	/**
	 * Reads from a file and returns a ragged array of doubles
	 * @param file - the file to read from
	 * @return a two dimensional ragged (depending on data) array of doubles if the file is not empty, returns a null if file is empty
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		if (file.length() == 0)
		{
			return null;
		}
		else
		{
			int numRows = 0;
			final int MAX_ROW = 10;
			final int MAX_COLUMN = 10;
			String [][] stringArray = new String [MAX_ROW][MAX_COLUMN];
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine())
			{
				scanner.nextLine();
				numRows++;
			}
			double doubleArray[][] = new double [numRows][];
			scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				for(int i = 0; i < doubleArray.length; i++)
				{
					String [] string =  scanner.nextLine().trim().split(" ");
					doubleArray[i] = new double [string.length];
					for(int j = 0; j < string.length; j++)
					{
						doubleArray[i][j] = Double.parseDouble(string[j]);
					}
				}
			}
			scanner.close();
			return doubleArray;
		}
	}
	/**
	 * Writes the ragged array of doubles into the file. Each row is on a separate line within the file and each double is separated by a space.
	 * @param data - two dimensional ragged array of doubles
	 * @param outputFile - the file to write to
	 * @throws IOException - if outputFile is not valid
	 */
	public static void writeToFile(double[][] data, File outputFile) throws IOException
	{
		FileWriter fileWriter = new FileWriter(outputFile, true);
		for (int row = 0; row < data.length; row++)
		{
			for(int column = 0; column < data[row].length; column++)
			{
				fileWriter.write(data[row][column] + " ");
			}
			fileWriter.write("\n");
		}
		fileWriter.close();
	}
}
