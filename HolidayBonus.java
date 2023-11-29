/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a utility class that will calculate holiday bonuses given a ragged array of doubles which represent the sales for each store in each category.
 * It will also take in bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in a category and the bonus amount for all other stores.
 * Due: 11/28/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class HolidayBonus {
	private static final double HIGHEST_BONUS = 5000.0;
	private static final double LOWEST_BONUS = 1000.0;
	private static final double NORMAL_BONUS = 2000.0;
	
	public HolidayBonus()
	{
		
	}
	/**
	 * Calculates the holiday bonus for each store
	 * @param data - the two dimensional array of store sales
	 * @return an array of the bonus for each store
	 */
	public static double[] calculateHolidayBonus(double[][] data)
	{
		double [] array = new double [data.length];
		int columnCount = 0;
		int maxRow = 0;
		int maxRowIndex = 0;
		for(int row = 0; row < data.length; row++)
		{
			for(int column = 0; column < data[row].length; column++)
			{
				columnCount++;
			}
			if (columnCount > maxRow)
			{
				maxRowIndex = row;
				maxRow = columnCount;
			}
			columnCount = 0;
		}
		for(int column = 0; column < data[maxRowIndex].length; column++)
		{
			int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, column);
			int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, column);
			if (data[highestIndex][column] > 0)
			{
				array[highestIndex] += HIGHEST_BONUS;
			}
			if (data[lowestIndex][column] > 0 && lowestIndex != highestIndex)
			{
				array[lowestIndex] += LOWEST_BONUS;
			}
			int status = 0;
			if (data[data.length-1].length > column && data[data.length-1][column] > 0)
			{
				
			}
			else
			{
				status = 1;
				for(int i = 0; i < data.length; i++)
				{
					if (i != highestIndex && i != lowestIndex && data[i].length > column && data[i][column] > 0)
					{
						array[i] += NORMAL_BONUS;
					}
				}
			}
			if(status != 1)
			{
				for(int i = 0; i < data.length; i++)
				{
					if (i != highestIndex && i != lowestIndex && data[i].length > column && data[i][column] > 0)
					{
						array[i] += NORMAL_BONUS;
					}
				}
			}
		}
		return array;
	}
	/**
	 * Calculates the total holiday bonuses
	 * @param data - the two dimensional array of store sales
	 * @return the total of all holiday bonuses
	 */
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double [] array = calculateHolidayBonus(data);
		double total = 0.0;
		for(int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		return total;
	}
	
}
