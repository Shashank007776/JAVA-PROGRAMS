package com.ControlConstruct.cc;
import java.util.Scanner;
public class DiscountApplicability {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the purchase amount : ");
		double purchaseamount = scan.nextDouble();
		discountApplicability(purchaseamount);
		scan.close();
		
	}
	public static void discountApplicability(double purchaseamount) { 
		if(purchaseamount > 100) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Discount is not Apllicable");
		}
		
		
	}

}
