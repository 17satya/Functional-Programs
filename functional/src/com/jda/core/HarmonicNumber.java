package com.jda.core;
import com.jda.utility.*;

public class HarmonicNumber {
	public static void main(String args[])
	{
		FunctionalUtility utility = new FunctionalUtility();
		int n = utility.getInt();
		float sum = 0;
		for (float i=1; i<=n; i++)
		{
			sum += 1/i;
		}
		System.out.println("The "+n+"th value is : " + sum);
	}
}
