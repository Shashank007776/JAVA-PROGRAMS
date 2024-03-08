package com.palindromechecker.cc;

public class PalindromeChecker {

boolean checkPalindrome(int n) {
		int reverse = 0;
		int temp = n;
		int remainder;
		while(n!=0) {
			remainder = n%10;
			reverse = (reverse*10)+remainder;
			n= n/10;

		}
		if(temp == reverse) {
			return true;
		}
		else {
			return false;
		
	}
	}
}

