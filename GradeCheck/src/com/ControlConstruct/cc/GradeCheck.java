package com.ControlConstruct.cc;
import java.util.Scanner;
public class GradeCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr marks : ");
		int marks = scan.nextInt();
		checkGrade(marks);
		scan.close();

	}
	public static void checkGrade(int marks) {
		if(marks >50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
