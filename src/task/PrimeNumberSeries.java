
package task;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		
		primenumberseries(a);

	}
static void primenumberseries(int a) {
	int count=0;
	for(int i=0;i<a;i++) {
		count=0;
	for(int j=1;j<i;j++) {
		if(a%j==0) {
			count++;
		}}
		if(count==2) {
			System.out.println(a+"is prime number");
		}
		
	
}

}}

