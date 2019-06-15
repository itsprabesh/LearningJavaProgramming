package com.prabeshpaudel;

public class DecimalComparator{

	public static boolean areEqualByThreeDecimalPlaces(double arg1, double arg2) {
		if(Math.abs(arg1-arg2) < 0.001) {
			return true;
		}
		else {
			return false;
		}
	}

}