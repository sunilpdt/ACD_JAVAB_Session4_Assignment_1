package com.acadgild;

public class Overriding {

	public static void main(String[] args){
		/*
		 * Overriding happens on the object being referred.
		 */
		Bank bank1=new HDFCBank();
		Bank bank2=new AxisBank();
		
		System.out.println("Rate of Interest provided by HDFC Bank is:"+bank1.rateOfInterest());
		
		System.out.println("Rate of Interest provided by Axis Bank is:"+bank2.rateOfInterest());
	}
	
}
