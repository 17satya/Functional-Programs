package com.jda.core;

import com.jda.utility.FunctionalUtility;

public class WindChill {
	public static void main(String args[])
	{
		System.out.println("Enter the temperature in Fahrenheits :");
		double temp = FunctionalUtility.getDouble();
		System.out.println("Enter the wind speed in miles  per hour :");
		double speed = FunctionalUtility.getDouble();
		double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75)*Math.pow(speed, 0.16);
		System.out.println("The wind speed is : "+w);
	}
}
 