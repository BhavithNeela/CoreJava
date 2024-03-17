package Example;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		for(int i=5;i>=0;i--) {
//			for(int j=i;j>=0;j--) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
				
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
//		for(int i=0;i<=5;i++) {
//			for(int j=i;j<=5;j++) {//0,1,2,3,4//0,1,2,3
//				System.out.print(" ");//
//			}
//			for(int j=0;j<1+(2*i);j++) {//1<=1
//				System.out.print(j);
//			}
//			System.out.println(" ");
//		}
//		
//
////		}
////
     }
	
}
