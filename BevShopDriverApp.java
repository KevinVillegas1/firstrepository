/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create a class with a main method to demonstrate all classes that use BevShop and Customer objects.
 * Due: 12/10/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */

import java.util.Scanner;

public class BevShopDriverApp {

	public static void main(String[] args) {
		BevShop b = new BevShop();
		System.out.println("The current order in process can have at most " + b.getMaxOrderForAlcohol() + " alcoholic beverages.");
		System.out.println("The minimum age to order alcohol drink is " + b.getMinAgeForAlcohol());
		System.out.println("Please start a new order: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Your order total for now is: $" + 0.0);
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		Customer c = new Customer (name, age);
		System.out.println("Hello " + c.getName());
		b.startNewOrder(4, Day.SUNDAY, name, age);
		boolean ageCheck = b.isValidAge(age);
		if (ageCheck == true)
		{
			System.out.println("Your age is 21 or above and you are eligible to order alcohol. Please add a drink to your order: ");
			b.getCurrentOrder().addNewBeverage("Alcohol1", Size.SMALL);
			System.out.println("Your " + b.getCurrentOrder().getBeverage(0).getType() + " order costs $"+ b.getCurrentOrder().getBeverage(0).calcPrice());
			System.out.println("Please add a smoothie to your order: ");
			b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 1, false);
			System.out.println("Your " + b.getCurrentOrder().getBeverage(1).getType() + " order costs $"+ b.getCurrentOrder().getBeverage(1).calcPrice());
			System.out.println("Please add a Coffee to your order: ");
			b.getCurrentOrder().addNewBeverage("Coffee1", Size.SMALL, false, false);
			System.out.println("Your " + b.getCurrentOrder().getBeverage(2).getType() + " order costs $"+ b.getCurrentOrder().getBeverage(2).calcPrice());
			System.out.println("Your complete order costs $" + b.getCurrentOrder().calcOrderTotal());
			System.out.println("Thank you!");
		}
		else
		{
			System.out.println("Your age is not 21 or above and you are not eligible to order alcohol.");
			System.out.println("Please add a smoothie to your order: ");
			b.getCurrentOrder().addNewBeverage("Smoothie1", Size.SMALL, 1, false);
			System.out.println("Your " + b.getCurrentOrder().getBeverage(0).getType() + " order costs $"+ b.getCurrentOrder().getBeverage(0).calcPrice());
			System.out.println("Please add a Coffee to your order: ");
			b.getCurrentOrder().addNewBeverage("Coffee1", Size.SMALL, false, false);
			System.out.println("Your " + b.getCurrentOrder().getBeverage(1).getType() + " order costs $"+ b.getCurrentOrder().getBeverage(1).calcPrice());
			System.out.println("Your complete order costs $" + b.getCurrentOrder().calcOrderTotal());
			System.out.println("Thank you!");
		}
	}

}
