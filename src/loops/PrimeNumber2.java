package loops;

public class PrimeNumber2 {
	public static void main(String[] a){
    	int n=Integer.parseInt(a[0]);
    	
    	primenumbermethod(n);
}
	public static void primenumbermethod(int n) {
	int count=0;
	
	for(int i=1;i<=n;i++) 
	{
	 count=0;
		for(int j=1;j<=i;j++) 
		{
		if(i%j==0) 
			count++;

		
    	}
		
		if(count==2) 
    		System.out.println(i);
	
	}
	
}
}