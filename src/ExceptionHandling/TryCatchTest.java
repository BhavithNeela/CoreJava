package ExceptionHandling;

import java.util.Scanner;

public class TryCatchTest {

	/**
	 * @param arg
	 */
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		
		try {
			int a=10;
	
		System.out.println(arg[0]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		
		}
		finally {
			int a=0;
			System.out.println(a);

		}
		System.out.println("try catch have be succesfully");
		System.out.println("enter the number");
		int b=sc.nextInt();
		int c=sc.nextInt();
		try {
			System.out.println(b/c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException");
		
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException"
					+ "");
			System.out.println("Exception Catched enter the another value other than Zero");
			
		}
		
		 //ODO Auto-generated method stub

	}
	
	

}
