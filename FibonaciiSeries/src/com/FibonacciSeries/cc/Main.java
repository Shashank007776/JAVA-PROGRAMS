package com.FibonacciSeries.cc;
import java.util.Scanner;
public class Main {
	public static void printFibonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		if(n == 1) {
			System.out.print(num1+" ");
		}
		else if(n == 2) {
			System.out.print(num1+" "+num2+" ");
		}
		else {
		System.out.print(num1+" "+num2+" ");
		
		for(int i=3;i<=n;i++) {
			int num3;
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3+" ");
		
		}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printFibonacci(n);
		scan.close();
	}

}
