package task;
import loops.FibonnaciSeries;
import loops.WhileLoop;
import loops.PrimeNumber;
import loops.DoWhileLoop;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {


		mainmethod();
		boolean e=true;
		for(;e;) {
		System.out.println("1.continue");
		System.out.println("2.exit");
		System.out.println("Enter yor choice");
		Scanner scanner=new Scanner(System.in);
		int b=scanner.nextInt();
		if(b==1) {
			mainmethod();
		}
		else
			e=false;
		System.out.println("Program Terminated");

		}

	}
	public static void mainmethod() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.primenumber");
		System.out.println("2.odd or even");
		System.out.println("3.fabinocci series");
		System.out.println("4.leapyear");
		System.out.println("5.Whileloop");
		System.out.println("6.DoWhileloop");
		System.out.println("Enter the choice");
		int a=scanner.nextInt();

		
		
		if(a==1) {
			System.out.println("Enter the number");

			int b=scanner.nextInt();
			PrimeNumber.primenumbermethod(b);
		}
		else if(a==2) {
			System.out.println("Enter the number");
			int b=scanner.nextInt();
			EvenNumber.EvenOrOdd(b);
			
		}
		else if(a==3) {
			System.out.println("Enter the number");

			int b=scanner.nextInt();
			FibonnaciSeries.FibonnaciSeriesMethod(b);
	}
		else if(a==4) {
			System.out.println("Enter the year");
			int b=scanner.nextInt();
			LeapYear obj=new LeapYear();
			obj.leapyear(b);
			
		}
		else if(a==5) {
			WhileLoop.whileLoopmethod();
		}
		else if(a==6) {
			DoWhileLoop.dowhilemethod();
		}
		else{
			System.out.println("enter the valid number");
		}
		
		
	}
}