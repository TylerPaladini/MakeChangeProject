package com.Skilldistillery.makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Welcome to Tyler's Outdoor Emporium, where you will find everything");
		System.out.println("you will ever need. We hope you enjoy your experience.");
		System.out.println();

		double total = 0;
		String answer;

		do {
			System.out.println("So how much does your item cost? ");
			double itemPrice = keyboard.nextDouble();
			total = total + itemPrice;
			System.out.println("Do you have anymore items to add to your checkout?  Type \"Done\" if you are finished");
			answer = keyboard.next();

		} while (!answer.equals("Done"));

		System.out.println("Your total is $" + total);
		System.out.println();

		System.out.println("How much cash do you have?");
		double moneyPaid = keyboard.nextDouble();

		double changeDue = 0;

		if (moneyPaid < total) {
			System.out.println("You must be crazy if you think this is enough money!! Get out of my store now!!!");
		} 
		else if (moneyPaid == total) {
			System.out.println("You gave me exact change, thank you!!");
		} 
		else {
			System.out.println("Let me get your change.\n");
			System.out.println("calculating... \n\t\t... \n\t\t\t...\n\t\t\t\tcalculating ...");
			System.out.println();

			changeDue = moneyPaid - total;
			System.out.println("Sorry that took so long, I am not the brightest. I owe you $" + df.format(changeDue));
			System.out.println();

			ChangeArray changeArray = new ChangeArray();
			changeArray.cashArry(changeDue);

			keyboard.close();

		}

	}
}
