package com.ControlConstruct.cc;
import java.util.Scanner;
public class MultipleOfTenChecker {
	public static void checkMultipleOfTen(int n) {
		if (n%10 == 0) {
			System.out.println("The Entered Number is Multiple Of 10");
		}
		else {
			System.out.println("The Entered Number is not Multiple of 10");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		checkMultipleOfTen(n);
		scan.close();
		

	}

}
