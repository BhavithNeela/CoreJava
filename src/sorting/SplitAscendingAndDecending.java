package sorting;

import java.util.Scanner;

public class SplitAscendingAndDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number in array");

			a[i]=sc.nextInt();
		}
		System.out.println("Enter the choice 1.SplitFirstAscending 2.SplitFirstdecending 3.SplitBothdecending4.SplitBothAscending");
           int b=sc.nextInt();
           if(b==1) {
		SplitFirstAscending(a);}
           else if(b==2)
		SplitFirstdecending(a);
           else if(b==3)
           SplitBothdecending(a);
           else
        	   SplitBothAscending(a);
	}
	public static void SplitFirstAscending(int a[]) {
		for(int i=0;i<a.length/2;i++) {
			int temp;
			for(int j=i+1;j<a.length/2;j++) {
				if(a[i]>a[j]) {//2>1
					temp=a[i];//temp=2
					a[i]=a[j];//a[0]=1
					a[j]=temp;//a[1]=2
				}}}
		for(int i=a.length-1;i>(a.length/2)-1;i--) {
			int temp;
			for(int j=i-1;j>(a.length/2)-1;j--) {
				if(a[i]>a[j]) {//4>3
					temp=a[j];//temp=3
					a[j]=a[i];//a[2]=4
					a[i]=temp;//a[3]=3
					
				}
	           }
			}
				System.out.println("Numbers after sorting");

				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+"  ");

				}
}
	public static void SplitFirstdecending(int a[]) {
		for(int i=0;i<a.length/2;i++) {
			int temp;
			for(int j=i+1;j<a.length/2;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		for(int i=a.length-1;i>(a.length/2)-1;i--) {
			int temp;
			for(int j=i-1;j>(a.length/2)-1;j--) {
				if(a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
	           }
			}
				System.out.println("Numbers after sorting");

				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+"  ");

				}
}
	public static void SplitBothdecending(int a[]) {
		for(int i=0;i<a.length/2;i++) {
			int temp;
			for(int j=i+1;j<a.length/2;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		for(int i=a.length-1;i>(a.length/2)-1;i--) {
			int temp;
			for(int j=i-1;j>(a.length/2)-1;j--) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
	           }
			}
				System.out.println("Numbers after sorting");

				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+"  ");

				}
}
	public static void SplitBothAscending(int a[]) {
		for(int i=0;i<a.length/2;i++) {
			int temp;
			for(int j=i+1;j<a.length/2;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		for(int i=a.length-1;i>(a.length/2)-1;i--) {
			int temp;
			for(int j=i-1;j>(a.length/2)-1;j--) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
	           }
			}
				System.out.println("Numbers after sorting");

				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+"  ");

				}
}
}