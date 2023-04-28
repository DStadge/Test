package de.iav.day2;



public class Aufgabe2 {

	public static int sum (int x, int y) {
		int sumxy = x + y;
	System.out.println("Die Int Summe beträgt: " + sumxy);
	return sumxy;
	}
	
	public static String sumString(int x, int y) {
		
		String summeString = String.valueOf(x + y);
		
		System.out.println("Die String Summe: " + summeString);
		
		return summeString;
	}
		
		public static void main (String[] args) {
			sum(2, 5);
			sum(7, 5);
			sum(2, 22);
			sumString(2, 8);
			
		}
	}

