package com.ControlConstruct.cc;
import java.util.Scanner;
public class Main {
	public static void ageCategorizer(int age) {
		if(age>0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>12 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>19 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = scan.nextInt();
		ageCategorizer(age);
		scan.close();

	}

}
