package wrapper;

public class WrapperClass {
	static void method1(){
		Byte b=null;
		Short s=null;
		Integer i= null;
		Long l=null;
		Float f=null;
		Character c= null;
		Double d=null;
		Boolean bo=null;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);


		System.out.println(c);
		System.out.println(bo);

		}
		static void method2(){
		Byte b=2;
		Short s=34;
		Integer i= 234;
		Long l=2345l;
		Character c= 'b';
		Double d=123d;
		Boolean bo=false;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(c);
		System.out.println(bo);
		System.out.println(d);


		}
	public static void main(String[] args) {
		method1();
		method2();

}
}