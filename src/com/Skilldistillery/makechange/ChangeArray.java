package com.Skilldistillery.makechange;

public class ChangeArray {
	double money[] = { 20, 10, 5, 1, .25, .10, .049, .009 };
	String denominations[] = { "Twenties: ", "Tens: ", "Fives: ", "Ones: ", "Quarters: ", "Dimes: ", "Nickels: ",
			"Pennies: " };

	public void cashArry(double total) {
		double changeDue = total;
		
		for (int i = 0; i < money.length; i++) {

			if (changeDue >= money[i]) {
				double newChange = changeDue % money[i];
				int amount = (int) ((changeDue - newChange) / money[i]);
				System.out.println(denominations[i] + amount);
				changeDue = newChange;

			}

		}

	}

}
