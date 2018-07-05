package com.jda.core;

import com.jda.utility.FunctionalUtility;

public class Distance {
	public static void main(String args[]) {
		System.out.println("Enter x coordinate : ");
		double x = FunctionalUtility.getDouble();
		System.out.println("Enter y coordinate : ");
		double y = FunctionalUtility.getDouble();
		double distance;
		x = Math.pow(x, 2);
		y = Math.pow(y, 2);
		distance = x + y;
		distance = Math.sqrt(distance);
		System.out.println("The distance is : " + distance);
	}
}
