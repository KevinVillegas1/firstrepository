import java.util.Scanner;
import java.util.Random;

/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a program that tests your ESP (extrasensory perception). Create a list of the seven names of colors. The program should randomly select the name of a color from your list of words. 
 * To select a word the program can generate a random number. Next, the program should ask the user to enter the color that the computer has selected. After the user has entered his or her guess, the program should display the name of the randomly selected color. 
 * The program should repeat these 11 times and then display the number of times the user correctly guessed the selected color.
 * Due: 09/11/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class ESPGame
{
	public static void main(String [] args)
	{
		// Variables, Constants, and Objects
		String name,mcNumber,description,dueDate,color,colorChosen = "0",colorLowerCase = "0";
		int round = 0,points = 0;
		Random rand = new Random();
	    Scanner input = new Scanner(System.in);
	    final String COLOR_RED = "Red";
	    final String COLOR_GREEN = "Green";
	    final String COLOR_BLUE = "Blue";
	    final String COLOR_ORANGE = "Orange";
	    final String COLOR_YELLOW = "Yellow";
	    final String COLOR_INDIGO = "Indigo";
	    final String COLOR_VIOLET = "Violet";
	    
	    // User Input
		System.out.println("Enter your name: ");
		name = input.nextLine();
		System.out.println("Enter your MC M#: ");
		mcNumber = input.nextLine();
		System.out.println("Describe yourself: ");
		description = input.nextLine();
		System.out.println("Due Date: ");
		dueDate = input.nextLine();
		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		
		// For Loop
		for(int i = 0; i<11; i++)
		{
			rand.nextInt(7);
			int r = rand.nextInt(7);
			System.out.println("Round " + (round += 1));
			System.out.println("\nI am thinking of a color.\nIs it Red, Green, Blue, Orange, Yellow, Indigo, or Violet?\nEnter your guess:");
			color = input.nextLine();
			if (r == 0)
			{
				colorChosen = COLOR_RED;
				colorLowerCase = "red";
			}
			if (r == 1)
			{
				colorChosen = COLOR_GREEN;
				colorLowerCase = "green";
			}
			if (r == 2)
			{
				colorChosen = COLOR_BLUE;
				colorLowerCase = "blue";
			}
			if (r == 3)
			{
				colorChosen = COLOR_ORANGE;
				colorLowerCase = "orange";
			}
			if (r == 4)
			{
				colorChosen = COLOR_YELLOW;
				colorLowerCase = "yellow";
			}
			if (r == 5)
			{
				colorChosen = COLOR_INDIGO;
				colorLowerCase = "indigo";
			}
			if (r == 6)
			{
				colorChosen = COLOR_VIOLET;
				colorLowerCase = "violet";
			}
			while (!color.equals("Red") && !color.equals("red") && !color.equals("Green") && !color.equals("green") && !color.equals("Blue") && !color.equals("blue") && !color.equals("Orange") && !color.equals("orange") && !color.equals("Yellow") && !color.equals("yellow") && !color.equals("Indigo") && !color.equals("indigo") && !color.equals("Violet") && !color.equals("violet"))
			{
				System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?\nEnter your guess again:");
				color = input.nextLine();
			}
			if (color.equals(colorChosen) || color.equals(colorLowerCase))
			{
				points++;
			}
			System.out.println("\nI was thinking of " + colorChosen + ".");
		}
		
		// Display Information
		System.out.println("Game Over\n\nYou guessed " + points + " out of 11 colors correctly.");
		System.out.println("User Name: " + name + "\nMC M#: " + mcNumber + "\nUser Description: " + description + "\nDue Date: " + dueDate + "\n");
	}

}
