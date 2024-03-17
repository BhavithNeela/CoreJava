package ThrowsTest;

import java.util.Scanner;

public class ThrowMainMethod extends ThrowsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			div(a,b);
			System.out.println("Print statement in Try block::::::::"
					+ "");
		}
		catch(Exception e) {
		System.out.println("exception in main method::::::::::::");
		}
		
		}

	

	

}
