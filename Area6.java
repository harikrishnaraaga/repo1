package com.csscorp;

import java.util.Scanner;

public class Area {
	int length;
	int breadth;
	void setDim()
	{
		Scanner src= new Scanner(System.in);
		System.out.println("Enter length :");
		length=src.nextInt();
		System.out.println("Enter breadth :");
		breadth=src.nextInt();
	}
	void getArea()
	{
		int area=length*breadth;
		System.out.println("area of rectangle :"+area);
	}
	public static void main(String[] args) {
		Area a = new Area();
		a.setDim();
		a.getArea();
	}
}
