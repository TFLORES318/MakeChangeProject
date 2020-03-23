package makechange;

import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Customer: How much is this one roll of toliet paper?");
		double tp = keyboard.nextDouble();
		System.out.println("Attendant: It is $" + tp + " dollars.");
		System.out.println("Customer: Okay, well this is what I have... here you go!..");
		double cash = keyboard.nextDouble();
		System.out.println("Attendant: Okay.. so you gave me $" + cash + ".");

		if (cash == tp) {
			System.out.println("Attendant: Exact change makes my life easy! Thanks have a good day!");
		} else if (cash > tp) {
			System.out.println("Attendant: You gave me too much money!");
			double changeBack = cash - tp;
			changeBack = (double) Math.round((changeBack) * 100) / 100; // returns 2 decimal places only
			System.out.println("Attendant: I'll have to give you $" + changeBack + " back...");

			double penny = 0;
			int nickel = 0;
			int dime = 0;
			int quarter = 0;
			int dollar1 = 0;
			int dollar5 = 0;
			int dollar10 = 0;
			int dollar20 = 0;

			keyboard.close();

			if (changeBack >= 20) {
				while (changeBack >= 20) {
					dollar20 = dollar20 + 1;
					changeBack = changeBack - 20;
				}
				System.out.println(+ dollar20 + " twenty dollar bill(s).");
			}

			if (changeBack >= 10) {
				while (changeBack >= 10) {
					dollar10 = dollar10 + 1;
					changeBack = changeBack - 10;
				}
				System.out.println(+ dollar10 + " ten dollar bill.");
			}

			if (changeBack >= 5) {
				while (changeBack >= 5) {
					dollar5 = dollar5 + 1;
					changeBack = changeBack - 5;
				}
				System.out.println(+ dollar5 + " five dollar bill.");
			}

			if (changeBack >= 1) {
				while (changeBack >= 1) {
					dollar1 = dollar1 + 1;
					changeBack = changeBack - 1;
				}
				System.out.println(+ dollar1 + " one dollar bill.");
			}

			if (changeBack >= .25) {
				while (changeBack >= .25) {
					quarter = quarter + 1;
					changeBack = changeBack - .25;
				}
				System.out.println(+ quarter + " quarter.");
			}

			if (changeBack >= .10) {
				while (changeBack >= .10) {
					dime = dime + 1;
					changeBack = changeBack - .10;
				}
				System.out.println(+ dime + " dime.");
			}

			if (changeBack >= .05) {
				while (changeBack >= .05) {
					nickel = nickel + 1;
					changeBack = changeBack - .05;
				}
				System.out.println(+ nickel + " nickel.");
			}

			if (changeBack >= .009) {
				while (changeBack >= .009) {
					penny = changeBack * 100;
					int pennyTotal = (int) Math.round(penny);
					System.out.println(+ pennyTotal + " pennies.");
					break;
				}
				System.out.println("Have a good day!");
			}
		} else if (cash < tp) {
			System.out.println("Attendant: You gave me too little money!");
		}
	}
}