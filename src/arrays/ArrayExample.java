package arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize =4;
		int arrayTest[] = new int[arraySize];
		
		for (int i = 0; i < 4; i++) {
			arrayTest[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("the numbers are="+arrayTest[i]);
			
		}
		System.out.println(arrayTest.length);
		System.out.println("hi");
	}

}
