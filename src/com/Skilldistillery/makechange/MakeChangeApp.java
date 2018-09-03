package com.Skilldistillery.makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		double total = 0;
		String answer;
		
		do {
			System.out.println("How much does the item cost? ");
			double itemPrice = keyboard.nextDouble();
			total = total + itemPrice;
			System.out.println("Do you want to continue or add another item, type \"Done\" if finished");
			answer = keyboard.next();
			
			
			
		} while (!answer.equals("Done"));

		System.out.println("Your total is " + total);
		System.out.println();
		
		System.out.println("How much money did you provide?");
		double moneyPaid = keyboard.nextDouble();

		double changeDue = 0;

		if (moneyPaid < total) {
			System.out.println("That is not enough money!");
		} else if (moneyPaid == total) {
			System.out.println("You gave me exact change, thank you!!");
		} else {
			System.out.println("Let me get your change.");
			System.out.println();

			changeDue = moneyPaid - total;
			System.out.println("I owe you " + df.format(changeDue) );
			System.out.println();

			ChangeArray changeArray = new ChangeArray();
			changeArray.cashArry(changeDue);


			keyboard.close();

		}

	}
}
