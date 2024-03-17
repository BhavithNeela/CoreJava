package keywords;

public class ThisTest {
	int a=10;
	final int b=10;
	//int b=100;
	public void add(int a,int b) {
		System.out.println(this.a+this.b);
	}
	public void addMethod2(int a,int b) {
		System.out.println(a+b);
	}
	

}
