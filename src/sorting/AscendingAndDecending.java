package sorting;

import java.util.Scanner;


public class AscendingAndDecending {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice 1 Ascending 2 Decending");
		int b=sc.nextInt();
		if(b==1) {
			Ascending();
		}
		else
			Decending()	;	}
		
	
public static void Ascending() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter the number in array");

		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		int temp;
		for(int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
	}
	System.out.println("Numbers after sorting");

	for(int i=0;i<n;i++) {
		System.out.println(a[i]);

	}
}

public static void Decending() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
	System.out.println("Enter the number in array");

	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	int temp;
	for(int j=i+1;j<n;j++) {
		if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}	
}
System.out.println("Numbers after sorting");

for(int i=0;i<n;i++) {
	System.out.println(a[i]);

}
}
}

