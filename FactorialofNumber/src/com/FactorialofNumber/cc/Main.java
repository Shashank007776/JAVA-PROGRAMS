package com.FactorialofNumber.cc;
import java.util.Scanner;
public class Main {
	public static void calculateFactorial(int n) {
		int fact=1;
		for(int i =1 ;i<=n ; i++) {
			fact =fact*i;
		}
		System.out.println(fact);
	}


	public static void main(String[] args) {
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter a number");
				int n = scan.nextInt();
				calculateFactorial(n);
				scan.close();
			}
	}

