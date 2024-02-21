package com.StringJoiner.joinString;
import java.util.Scanner;
public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your First Name and Last Name : ");
		String fname = scan.next();
		String lname =scan.next();
		System.out.println("The Full Name is :" +joinString(fname,lname));
		scan.close();

	}
	public static String joinString(String str1,String str2) {
		return (str1+" "+str2);
	}
}
