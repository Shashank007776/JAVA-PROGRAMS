package com.SumofDigitCalculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = scan.nextInt();
		Calculatesum.calculateSumofDigits(n);
		scan.close();

	}
	

}
