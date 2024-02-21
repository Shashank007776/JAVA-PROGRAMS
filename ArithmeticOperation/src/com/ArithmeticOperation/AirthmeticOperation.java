package com.ArithmeticOperation;
import java.util.Scanner;
public class AirthmeticOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr Two Numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The Subratction of two numbers is :"+subtractNumbers(num1,num2));
		System.out.println("Enetr Two Numbers : ");
	    num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The Product of two numbers is :"+multiplyNumbers(num1,num2));
		System.out.println("Enetr Two Numbers : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The Divison of two numbers is :"+divideNumbers(num1,num2));
		System.out.println("Enetr Two Numbers : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The Remainder of two numbers is :"+findRemainder(num1,num2));
		scan.close();
 
	}
	public static int subtractNumbers(int num1, int num2) {
		return (num1-num2);
	}
	public static int multiplyNumbers(int num1, int num2) {
		return (num1*num2);
	}
	public static double divideNumbers(int num1, int num2) {
		return (num1/num2);
	}
	public static int findRemainder(int num1, int num2) {
		return (num1%num2);
	}
	

}
