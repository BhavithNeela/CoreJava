package loops;

import java.util.Scanner;

public class DoWhileLoop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dowhilemethod();

	}
	public static void dowhilemethod() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");

		int a=sc.nextInt();
		int i=0;
		System.out.println(a+" natural numbers");
		do {
			System.out.println(i);
			i++;
		}while(i<=a);
	}

}
