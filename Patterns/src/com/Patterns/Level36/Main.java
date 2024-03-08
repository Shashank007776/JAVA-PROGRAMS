package com.Patterns.Level36;

public class Main {

	public static void main(String[] args) {
		int n =10;
		for(int i =0 ; i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0||i==n||j==n||j==n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		

		}

	}

}
