package loops;

public class PrimeNumber {
    public static void main(String[] a){
    	int a1=Integer.parseInt(a[0]);
    	
    	primenumbermethod(a1);
    }
    	
    	public static void primenumbermethod(int a1) {
    	int count=0;
    	for(int i=1;i<a1;i++) {
    		if(a1%i==0) {
    			count++;
    		}
    		
    	}
    	if(count>2) {
    		System.out.println("Not a prime number");
    	}
    	else
    		System.out.println("prime number");
	
}

		
 
}
