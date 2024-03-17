package accessmodifier;

public class Test1 {
	 private static int a=10;
     static int b=20;
     static protected int  c=30;
    static public int d=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
           System.out.println(add()); 
           System.out.println(add1()); 
           System.out.println(add2()); 
           System.out.println(add3()); 
	}

	private static int add() {
		return a+b+c+d;
	}

	 static int add1() {
		return a+b+c+d;
	}

		protected static int add2() {
			return a+b+c+d;
		}
		public static int add3() {
			return a+b+c+d;
		}
}
