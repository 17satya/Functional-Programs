package com.jda.utility;

import java.util.*;

public class FunctionalUtility {
	public static int getInt()
	{
		System.out.println("Enter an integer:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}
	public static String getString()
	{
		System.out.println("Enter a string input:");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		return inputString;
	}
}
