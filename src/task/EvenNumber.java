package task;

public class EvenNumber {
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		EvenOrOdd(a);
		
		}
	public static void EvenOrOdd(int a) {
	if(a%2==0){

		System.out.println("Given num "+a+" is even");
		}
		else{
		System.out.println("Given num "+a+" is odd");
		}
	}
}
