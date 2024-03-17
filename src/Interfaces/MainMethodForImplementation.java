package Interfaces;

import java.util.Scanner;

public class MainMethodForImplementation extends InterfaceImplementation {

	public static void main(String[] args) {
		InterfaceImplementation obj=new InterfaceImplementation();
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		a=sc.nextInt();
		obj.methodInterface(a);
		// TODO Auto-generated method stub

	}

}
