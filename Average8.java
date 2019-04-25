package com.csscorp;

import java.util.Scanner;

public class Average8 {
	void calAverage()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number :");
		int num1 = sc.nextInt();
		System.out.println("enter 2st number :");
		int num2 = sc.nextInt();
		System.out.println("enter 3st number :");
		int num3 = sc.nextInt();
		int total = num1+num2+num3;
		int avg = total/3;
		System.out.println("average of three numbers is :"+avg);
	}
	public static void main(String[] args) {
		Average av = new Average();
		av.calAverage();
	}
}
