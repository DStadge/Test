package de.iav.day2;

import java.util.Scanner;


public class Scanner1 {

	
	public static void main(String[] args) {
		
		
		Scanner scr1 = new Scanner(System.in);
		System.out.print("Bitte Namen eingeben: ");
		String name = scr1.next(); 
		System.out.println("Hallo: " + name);
	//	scr1.close();
		
		
		Scanner scr2 = new Scanner(System.in);
		System.out.print("Zahl: ");
		int zahl = scr2.nextInt();
		System.out.println("Die Zahl lautet: " + zahl);
		scr2.close();
		
		
	}
	


}
