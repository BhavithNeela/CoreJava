package coreProject;

import java.util.Scanner;

public class CoreProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		machine();
		System.out.println("press 1 to Menu");
		Scanner s =new Scanner(System.in);
		int b=s.nextInt();
		if(b==1) {
			machine();
		}
}
public static void machine() {
int sum=0;
	System.out.println("Welcome");
	Scanner sc = new Scanner(System.in);
	System.out.println("Select The Product Given Below");
	System.out.println("1.Bottle");
	System.out.println("2.Chips");
	System.out.println("3.Samosa");
	System.out.println(" How Many Items Should Select");
	int userInput = sc.nextInt();
	int[] a=new int[userInput];
	for(int i=1;i<=3;i++) {
		a[i]=sc.nextInt();
		}
	for(int i=1;i<=a.length;i++) {
		
	switch(a[i]) {
	case 1:
		sum=sum+20;
	 break;
	case 2:
		sum=sum+10;
	 break;
	case 3:
		sum=sum+10;
	break;
	}
	}
System.out.println("The Amount is "+sum);
System.out.println("we will Accept 5, 10 , 20 , 50 , 100");
System.out.println("Bill Amount");
int userMoney = sc.nextInt();
System.out.println("user money recived");
int change= userMoney - sum;
if(change<0) {
	System.out.println("In Sufficient Amount =" + (sum+change));
}
else
	System.out.println(" Amount Should be Return ="+(change));
		

}
}
