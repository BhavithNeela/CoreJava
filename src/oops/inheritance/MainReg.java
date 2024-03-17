package oops.inheritance;

public class MainReg  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StudentRegistration obj=new  StudentRegistration();
		 System.out.println("StudentPersonalDetails::::");
		 System.out.println("Fname="+obj.Fname);
		 System.out.println("Lname="+obj.Lname);
		 System.out.println("Mno="+obj.Mno);
		 System.out.println("Email="+obj.email);
		 System.out.println("Gender="+obj.gender);
		 System.out.println("DOB="+obj.DOB);
		 
		 
		 System.out.println("Student college details:::::");
		 System.out.println("StudentId="+obj.SId);
		 System.out.println("Course="+obj.Course);
		 System.out.println("Year of completion="+obj.year_of_completion);
		 
		 
		 System.out.println("Student address:::: ");
		 System.out.println("dno="+obj.dno);
		 System.out.println("Street="+obj.street);
		 System.out.println("Area="+obj.Area);
		 System.out.println("District="+obj.dist);
		 System.out.println("State="+obj.state);
		 System.out.println("Cuntry="+obj.country);
		 System.out.println("pincode="+obj.pincode);


	}

}
