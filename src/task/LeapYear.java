package task;

public class LeapYear {
	public static void main(String[] args)
	{
	int a=Integer.parseInt(args[0]);
	LeapYear obj=new LeapYear();
	obj.leapyear(a);
	

}
	void leapyear(int a) {
	if((a%4==0&&a%100!=0)||a%400==0){
		System.out.println("leap year");}
		else
		System.out.println("not a leap year");

		}
}