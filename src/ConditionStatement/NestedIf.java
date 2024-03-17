package ConditionStatement;

public class NestedIf {
	public static void main(String[] ags) {
		int a=10;
		if(a>0) {
			if(a>10) {
				System.out.println("a is greater than 10");
			}
			else
				System.out.println("a is less than 10");
		}
		else 
			
			System.out.println("a is less than 0");

	}

}
