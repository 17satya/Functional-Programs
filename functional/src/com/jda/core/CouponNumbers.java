package com.jda.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jda.utility.FunctionalUtility;

public class CouponNumbers 
{
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of coupons to be generated :");
		int n = FunctionalUtility.getInt();
		int couponGenerated;
		int count = 0;
		Random rand = new Random();
		
		List<Integer> coupons = new ArrayList<>();
		while (coupons.size() < n) {
			Boolean match = false;
			couponGenerated = rand.nextInt(n);
			count++;
			for (int coupon : coupons) {
				if (couponGenerated == coupon) {
					match = true;
					break;
				}
			}
			if (match == false) {
				coupons.add(couponGenerated);
			}
		}
		System.out.println("The coupons are: \n  "+ coupons);
		/*for (int coupon : coupons) {
			System.out.println(coupon);
		}*/
		System.out.println("The number of times tried :" + count);
	}
}
