package loops;

import java.util.Scanner;
public class WhileLoop {
public static void main(String args[]) {
	
	whileLoopmethod(); 
}
public static void whileLoopmethod() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=sc.nextInt();
	int i=0;
	while(i<a) {
		System.out.println(i);
		i++;
		
	}
	
}
}
