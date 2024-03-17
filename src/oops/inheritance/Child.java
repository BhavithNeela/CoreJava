package oops.inheritance;

public class Child extends Parent{

	 void add() {
		sum=a+b;
		System.out.println(sum);
	}
	static void sub() {
		int sub=a-b;
		System.out.println(sub);
	}
	static void mul() {
		int mul=a*b;
		System.out.println(mul);
	}
	static void div() {
		System.out.println(a/b);
	}
	void a() {
	System.out.println(a);}
 
}
