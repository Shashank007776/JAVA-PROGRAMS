package com.Patterns.Level27;

public class Main {

	public static void main(String[] args) {
		int n =11;
		for(int i =0 ; i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==n||j==n) {
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
