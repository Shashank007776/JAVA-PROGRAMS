package com.Package.Level41;

public class Main {

public static void main(String[] args) {
    char x ='A';
    int z = x;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(x);
			z++;
			x=(char)z;
			
		}
		System.out.println();
	}
}
}