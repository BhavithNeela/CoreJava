package collextions;

public class Student {
	 int key;
	   String var2;
//	public String getVar1() {

//	public String toString() {
//		return "TestData [var1=" + key + ", var2=" + var2 + "]";
//	}
	public String getKey() {
		return key+var2;
	}
	public void setKey(int key ,String var2) {
		this.key = key;
		this.var2=var2;
	}
	@Override
	public String toString() {
		return "Student [key=" + key + ", var2=" + var2 + "]";
	}
	
	
	

}
