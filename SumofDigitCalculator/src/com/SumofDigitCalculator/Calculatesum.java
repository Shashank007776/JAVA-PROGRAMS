package com.SumofDigitCalculator;

public class Calculatesum {
	public static void calculateSumofDigits(int n) {
		int sum =0;
		while(n!=0){
			int r = n%10;  
			sum = sum+r;
			n = n/10;
		}
		System.out.println(sum);
	}
}
