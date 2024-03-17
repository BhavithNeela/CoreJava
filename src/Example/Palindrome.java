package Example;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=155;
       int temp=a, rem=0,rev=0;
       while(temp>0) {
    	   rem=temp%10;
    	   rev = rev*10+rem;
    	   temp=temp/10;
    	   
       }
       if(a==rev) {
    	   System.out.println("hey its a Palindrime");
       }
       else
    	   System.out.println("not a palindrome");
     
	}

}
