package com.palindromechecker.cc;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		PalindromeChecker c1 = new PalindromeChecker();
		boolean result = c1.checkPalindrome(n);
		if(result == true) {
			System.out.println("The given number is Palindrome ");
		}
		else {
			System.out.println("The given number is not Palindrome ");
		}
		scan.close();

	}

}
