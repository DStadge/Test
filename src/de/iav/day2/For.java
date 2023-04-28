package de.iav.day2;


import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		System.out.print("Bitte Zahl zwischen 1 und 16 eingeben: ");
		Scanner scr = new Scanner(System.in);
			int num = scr.nextInt(); 
			scr.close();
				int i;
				int fact = 1;
				//int num = number;
	
				for (i = 1 ; i<=num;i++) {
				fact = fact * i;
				
					
				}
				System.out.println("Deine Fakultät von " + num + " ist: " + fact);
				
				
				
	}

}
