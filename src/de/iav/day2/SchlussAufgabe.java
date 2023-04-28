package de.iav.day2;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;


public class SchlussAufgabe {

	public static String name () {
		
		String name = "Dirk";
		System.out.println("Dein Name lautet: " + name);
		return name;
	}
		//public static boolean zahl () {
	//	boolean b = x > 0;
	//	return b;
	
//}

public static int sqrt(int s) {
	
	int zahl = s;
	
//	System.out.println("Die String Summe: " + summeString);
	
	return zahl;
}
	
	public static void main (String[] args) {
		
	System.out.println("Teil 1");	
		name();
		System.out.println("----------");
	System.out.println("Teil 2");	
	for (int i = 1 ; i<=5;i++) {
		name();
	}
		System.out.println("Teil 3");	
		Scanner scr = new Scanner(System.in);
		System.out.print("Bitte Ganze Zahl groesser Null eingeben: ");
		int x = scr.nextInt();
		System.out.println("Zahl ist groesser Null" + x);
		System.out.println("Teil 4");
	//	zahl();
		int b;
		
		System.out.println();
		
		System.out.println("Teil 5");
		
		
		scr.close();
			
		
	
	
	}
}
