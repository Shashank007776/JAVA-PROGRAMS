package com.GalacticArithmetic.Addition;

import java.util.Scanner;
public class GalacticArthmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number in Arithmetica number system : " );
		long num1 = scan.nextLong();
		System.out.println("Enter the second number in Arithmetica number system : ");
		long num2 = scan.nextLong();
        System.out.println("==========================================================");
        System.out.println("The Result of Galactic Addition of Arithmetica number system is :" +galacticAddition(num1,num2) );
        scan.close();
	}
	public static long galacticAddition(long num1,long num2) {
		return (num1+num2);
	}

}
