package com.acadgild;

import java.util.Scanner;

public class OverLoading {

	/*
	 * overloaded methods with same name but different parameters
	 */
	public int add(int a,int b){return a+b;}  
	public int add(int a,int b,int c){return a+b+c;}  
	
	public static void main(String[] args){
		
		int num1=0;
		int num2=0;
		int num3=0;
		
		OverLoading overload=new OverLoading();
		
		System.out.println("Enter 1st number:");
		Scanner scan1=new Scanner(System.in);
		num1=scan1.nextInt();
		
		System.out.println("Enter 2nd number:");
		Scanner scan2=new Scanner(System.in);
		num2=scan2.nextInt();
		
		System.out.println("Enter 3rd number:");
		Scanner scan3=new Scanner(System.in);
		num3=scan3.nextInt();
		
		System.out.println("Addition of two numbers is: "+overload.add(num1, num2));
		
		System.out.println("Addition of 3 numbers is: "+overload.add(num1, num2,num3));
		
		
	}
}
