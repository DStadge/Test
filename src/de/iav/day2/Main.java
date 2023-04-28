package de.iav.day2;

public class Main {


		 public static long sum(long num1, long num2) {
		  long sum = num1 + num2;
		  return sum;
		 }
		 
		 public static String sumString(long x, long y) {
		  long sum = sum(x, y);
		  
		  return "Sum: "+ sum;
		  
		 }
		  public static void main(String[] args) {
		   
		   long x = 7;
		   long y = 9;
		   
		   String sum = sumString(x, y);
		   
		   System.out.println(sum);
		  }

		}