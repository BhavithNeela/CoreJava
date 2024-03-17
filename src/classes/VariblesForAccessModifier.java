package classes;

public class VariblesForAccessModifier {
	 private static int a=10;
     static int b=20;
     static  protected int  c=30;
     public static int d=40;
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
