package com.csscorp;

import java.util.Scanner;

public class Area7 {
	int length;
	int breadth;
	Area7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length :");
		this.length=sc.nextInt();
		System.out.println("Enter breadth :");
		this.breadth=sc.nextInt();
	}
	void returnArea()
	{
		int area=length*breadth;
		System.out.println("area of rectangle :"+area);
	}
	public static void main(String[] args) {
		Area7 a = new Area7();
		a.returnArea();
	}
}
