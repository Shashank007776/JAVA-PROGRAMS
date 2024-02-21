package com.DoubleTrouble.DoubleTheNumber;
import java.util.Scanner;
public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number which you want to Double");
		int num = scan.nextInt();
		System.out.println("The result is : "+doubleTheNumber(num));
		scan.close();
	}
	
	public static int doubleTheNumber(int num) {
		return (num*2);
	}

}
