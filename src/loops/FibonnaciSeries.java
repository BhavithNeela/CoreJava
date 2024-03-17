package loops;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = Integer.parseInt(args[0]);
		FibonnaciSeriesMethod(c);
;	}
	
	public static void FibonnaciSeriesMethod(int c) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<c;i++) {
			int fabi=a+b;
			System.out.println(fabi );
			a=b;
			b=fabi;
		}
}
}