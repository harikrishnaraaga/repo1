package com.csscorp;

public class Complex9 {
static int a=6;
static int b=8;
	static void sum()
	{
		int sum = a+b;
		System.out.println("sum is :"+sum);
	}
	static void difference()
	{
		int diff = a-b;
		System.out.println("difference is :"+diff);
	}
	static void product()
	{
		int pro = a*b;
		System.out.println("Product is :"+pro);
	}
	public static void main(String[] args) {
		Complex9.sum();
		Complex9.difference();
		Complex9.product();
	}
}
