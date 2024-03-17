package methods;

public class MethodOverloading {
public static void main(String[] ag) {
	int a=Integer.parseInt(ag[0]);
	int b=Integer.parseInt(ag[1]);
	int c=Integer.parseInt(ag[2]);

	
	method(a,b);
	method(a,b,c);
}
static void method(int a,int b) {
	System.out.println(a+b);
	
}
static void method(int a,int b,int c) {
	System.out.println(a+b+c);
    System.out.println();
}

}
