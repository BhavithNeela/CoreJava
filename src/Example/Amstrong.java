package Example;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int count=0,rem=0,sum=0;
		int temp=a;
		int temp1=a;
		//System.out.println(a);
		while(temp>0) {
			 temp = temp/10;
			count++;
		}
		//System.out.println(temp);
		//System.out.println(count);
		while(temp1>0) {
			rem=temp1%10;//3//5
			sum += (Math.pow(rem, count));//27+125+1
			temp1= temp1/10;
		}
		//System.out.println(count);
		System.out.println(sum);
		if(a==sum) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not a Armstrong Number");
		

	}

}
