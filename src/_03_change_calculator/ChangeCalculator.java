package _03_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
int nick = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dime = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String Quarters = JOptionPane.showInputDialog("How many dimes do you have?");
int Quart = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
double money = nick*.05 + dime*.1 + Quart*.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $" + money);
	}
}

