package ConditionStatement;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=25;
		if(a>15){
		System.out.println("a is greater than 15");
		}
		else 
		System.out.println("a is lesser than 15");
		if(a>5){
		System.out.println("a is Greater than 5");
		}
		if(a>15){
		System.out.println("a is Greater than 15");
		}
		else if(a>b){
		System.out.println("a is Greater than b");
		}
		else
		System.out.println("b is Greater than a");

		if((a/2)==0&&(a!=0)){
		System.out.println("a is divisible by 2");

		}
		else
		{
		System.out.println("a is not divisible by 2");
		}
		if((a%5==0) || (a==0)){
		System.out.println("a is divisible by 5 or a is zero");

		}
		else
		{
		System.out.println("a is not divisible by 5 and not a zero");
		}


	}

}
