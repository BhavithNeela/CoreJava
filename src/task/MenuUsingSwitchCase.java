package task;

import java.util.Scanner;

import loops.DoWhileLoop;
import loops.FibonnaciSeries;
import loops.PrimeNumber;
import loops.WhileLoop;

public class MenuUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int b;
		switch(a){
		case 1:
			System.out.println("Enter the number");

			b=scanner.nextInt();
			PrimeNumber.primenumbermethod(b);
			break;
			
		case 2:
			System.out.println("Enter the number");
			 b=scanner.nextInt();
			EvenNumber.EvenOrOdd(b);
			break;
		case 3:
			System.out.println("Enter the number");

		 b=scanner.nextInt();
		FibonnaciSeries.FibonnaciSeriesMethod(b);
			
			break;
			
			
		case 4:
			System.out.println("Enter the year");
			b=scanner.nextInt();
			LeapYear obj=new LeapYear();
			obj.leapyear(b);
			
			break;
		case 5:
			WhileLoop.whileLoopmethod();
			break;
		case 6:
			DoWhileLoop.dowhilemethod();
			break;
		default:
			System.out.println("enter the valid number");
		    break;
		}

	}

}
