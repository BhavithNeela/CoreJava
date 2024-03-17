package ThrowsTest;

public class ThrowsTest {
public static  int div(int a,int b) throws Exception {
	try {
	return a/b;
	}
	catch(Exception e) {
		System.out.println("Exception div Method::::::::::::::");
		throw e;
	}
	
}
}
