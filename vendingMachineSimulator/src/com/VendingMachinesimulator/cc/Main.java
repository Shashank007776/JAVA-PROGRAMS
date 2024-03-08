package com.VendingMachinesimulator.cc;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Product Code : ");
		String productcode = scan.next();
		getProduct(productcode);
		scan.close();
	}
	public static void getProduct(String productcode) {
		switch(productcode) {
		case "P01" : System.out.println("CocaCola");
		             break;
		case "P02" : System.out.println("Pepsi");
                     break;
		case "P03" : System.out.println("Fanta");
                     break;
		case "P04" : System.out.println("JalJeera");
                     break;
		case "P05" : System.out.println("MountainDew");
                     break;
		case "P06" : System.out.println("BoatGauva");
                     break;
        default : System.out.println("Panaka");
		       
		}
	}

}
