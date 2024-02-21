package com.JourrneyCalculator.calculateDistance;
import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Speed and Time : ");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JourneyCalculator journeycalculator = new JourneyCalculator();
		System.out.println("The Distance travelled is : "+journeycalculator.calculateDistance(speed, time));
		scan.close();

	}

}
