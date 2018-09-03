package com.Skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How much does the item cost? ");
		double itemPrice = keyboard.nextDouble();
		
		System.out.println("How much money did you provide?");
		double moneyPaid = keyboard.nextDouble();
		
		double changeDue = 0;
		
		
		
		if(moneyPaid < itemPrice) {
			System.out.println("That is not enough money!");
		}
			else if (moneyPaid == itemPrice) {
				System.out.println("You gave me exact change, thank you!!");
		}
			else {
				System.out.println("Let me get your change.");
				System.out.println();
			
				changeDue = moneyPaid - itemPrice;
				System.out.println("I owe you " + changeDue);
				System.out.println();
				
				
				
				double newChange = changeDue % 20;
				int twenties =(int)(changeDue-newChange) / 20;
				
				changeDue = newChange;
				newChange = changeDue % 10;
				int tens = (int)(changeDue-newChange) / 10;
				
				changeDue = newChange;
				newChange = changeDue % 5;
				int fives = (int)(changeDue -newChange) / 5 ;
				
				changeDue = newChange;
				newChange = changeDue % 1;
				int ones = (int)(changeDue - newChange) / 1;
				
				changeDue = newChange;
				newChange = changeDue % .25;
				int quarters = (int)((changeDue - newChange) / .25);
				
				changeDue = newChange;
				newChange = changeDue % .10;
				int dimes = (int)((changeDue - newChange) / .10);
				
				changeDue = newChange;
				newChange = changeDue % .05;
				int nickels = (int)((changeDue - newChange) / .05);
				
				changeDue = newChange;
				newChange= changeDue % .009;
				int pennies = (int)((changeDue-newChange) / .009);
			
			
				
				
				
				
				
				if ( twenties > 0) {
					System.out.println("twenties: " + twenties);
				}
				
				if ( tens > 0 ) {
					System.out.println("tens:" + tens);
				}
				
				if ( fives > 0) {
					System.out.println("fives:" + fives);
				}
				
				if (ones > 0 ) {
					System.out.println("ones: " + ones);
				}
				
				if (quarters > 0 ) {
					System.out.println("quarters: " + quarters);
				}
				
				if( dimes > 0 ) {
					System.out.println("dimes: " + dimes);
				}
				
				if (nickels > 0 ) {
					System.out.println("nickles: " + nickels);
				}
				
				if ( pennies > 0 ) {
					System.out.println("pennies: " + pennies);
				}
				
			
				
			}
		
			
	
			
			
		keyboard.close();
		
		}
		
		
	}


