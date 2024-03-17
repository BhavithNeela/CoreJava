package strings;

public class StringVaribles {
	public static void main(String[] args) {
		stringvaribles();
		
	}
	public static void stringvaribles() {
		String str="bhavith ";
		String str1="neela";
		String str2="boo:and:foo";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.charAt(7));
		System.out.println(str.compareTo(str1));
		System.out.println("subString="+str.substring(3));
		System.out.println("string split"+str2.split(":"));
		System.out.println("codePointBefore"+str.codePointBefore(3));
		System.out.println("indexOf="+str.indexOf('v'));
		System.out.println(str.equals(str1));
		String s=new String("Bhavith neela");
		System.out.println(s);
		System.out.println(str.concat(s));
		System.out.println(s.compareTo(str1));
		System.out.println(s.replaceAll(str1, s));

	}

}
