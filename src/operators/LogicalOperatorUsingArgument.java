package operators;

public class LogicalOperatorUsingArgument {
	void greaterthanequal(int a, int b)
	{		//int a,b;
		System.out.println("a<=b:"+(a<=b));}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
	System.out.println("a<b:"+(a<b));
		
		
		
	
		System.out.println("a>=b:"+(a>=b));
		
		System.out.println("a!=b:"+(a!=b));
	
		System.out.println("not="+!(a!=b));
		
		LogicalOperatorUsingArgument obj=new LogicalOperatorUsingArgument();
		obj.greaterthanequal(a,b);

	}

}
