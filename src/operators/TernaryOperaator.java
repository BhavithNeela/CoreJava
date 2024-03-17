package operators;

public class TernaryOperaator {
	public static void main(String[] args) {
		int a=21,b=30,d;
		String e,f,g;
		d=(a>b)?a:b;
		System.out.println(d);
		e=(a>b)?"ais big":"b is big";
		System.out.println(e);
		f=(a>b)?((a%2==0)?"a is greater and it is a even":"b is a greater and it is a odd"):((b%2==0)?"b is greater and its is a even":"b is a grearter");
		System.out.println(f);
		g=(a>23)?"a is greater than 23":(++a>23)?"a is greater than 23":(++a>23)?"a is greater than 22":"a is less than23";
		System.out.println(g);
		
	}

}
