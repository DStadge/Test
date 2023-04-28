package de.iav.day1;

import javax.security.auth.x500.X500Principal;

public class Wuerfel {

	public static void main(String[] args) {
		
		double a = Math.random();
		double b = Math.random();
		
		a = a * 10;
		b = b * 10;
				
			
		int c,d;
		
		c = (int) Math.round(a);
		d = (int) Math.round(b);
		int i = 0, j = 0;
		
		
		do { 							//Wiederhole bis a zwischen 1 und 6
		a = Math.random();
		
	
		j = i++;
		System.out.println((i) + "x mal gewürfelt fuer eine gueltige Zahl" );
		a = a * 10;
	
				
		c = (int) Math.round(a);

		}
			while (c <=1 || c>=6);
		do {            				//Wiederhole bis b zwischen 1 und 6
		
		b = Math.random();
		
		//j = j++;
		
			b = b * 10;
			
			d = (int) Math.round(b);

			}
				while (d <=1 || d>=6);
			
				
		System.out.println((i) + "x mal gewürfelt fuer eine gueltige Zahl" );
		System.out.println("Wuerfel 1: " + (c));
		System.out.println((j) + "x mal gewürfelt fuer eine gueltige Zahl" );
		System.out.println("Wuerfel 2: " + (d));
		
	

}
}