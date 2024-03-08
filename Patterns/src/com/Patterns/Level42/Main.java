package com.Patterns.Level42;

public class Main {

	public static void main(String[] args) {
			for(int i=1;i<=5;i++) {
				char x ='A';
				for(int j=1;j<=i;j++) {
					int z = x;
					System.out.print(x);
					z++;
					x=(char)z;
					
				}
				System.out.println();
			}

	}

}
