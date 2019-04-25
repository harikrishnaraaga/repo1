package com.csscorp;

import java.util.Scanner;

public class Employee10 {
	public static void main(String[] args) {
		String name;
		int yoj;
		String address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		name = sc.nextLine();
		System.out.println("Enter Year Of Joining :");
		yoj = sc.nextInt();
		System.out.println("Address :");
		address = sc.nextLine();
		System.out.println("Name     Year of joining     Address");
		System.out.println(name+"        "+yoj+"       "+address);
	}
}
