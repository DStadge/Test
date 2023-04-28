package de.iav.day2;

import java.util.Scanner;


public class While {

	public static void main(Int[] args) {
		Int i;
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Bitte gib eine Zahl ein: ");
		String input = scr.next();

		i = input;
		
		while (i<50) {
			i++;
			System.out.println("Zahl: " + i);
			
		}
		
		
	}

}
