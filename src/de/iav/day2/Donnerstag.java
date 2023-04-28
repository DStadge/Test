package de.iav.day2;

import java.util.Scanner;

public class Donnerstag {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib bitte A, B, C, D oder F ein: ");
		String input = scanner.next();
		
		
		switch (input) {
		  	case "A" : 
		  	System.out.println("Super Arbeit A"); 
		  	break;
		  	case "B" : 
			  	System.out.println("Gute Arbeit B "); 
			  	break;
		  	case "C" : 
			  	System.out.println("Durchschnittliche Arbeit C"); 
			  	break;
		  	case "D" : 
		  	case "F" :
			  	System.out.println("Du kannst besser arbeiten!"); 
			  	break;
		default:
		System.out.println("Falsche Eingabe!"); 
		}
	}

}
