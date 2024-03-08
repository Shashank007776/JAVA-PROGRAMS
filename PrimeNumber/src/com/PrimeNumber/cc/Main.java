package com.PrimeNumber.cc;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrime(n);
		scan.close();
		
		
	}
	public static void printPrime(int n) {
		int count=0;
		for(int i=3;count<n;i++) {
			boolean result = checkPrime(i);
			if(result == true) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
	public static boolean checkPrime(int n) {
		for(int i=2 ;i<n;i++ ) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
