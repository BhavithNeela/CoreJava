package Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class date {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d= new Date();
		
		//StringDateFormat sdf= new stringdateformat();
		String s= "yy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(s);
	
		System.out.println(sdf.format(d));
		String s2= "yyy-MMMM-dd";
		SimpleDateFormat sdf1 = new SimpleDateFormat(s2);
	
		System.out.println(sdf1.format(d));
		Date d2=new Date();
		d2.setTime(1703738247000l);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d2.after(d));
		System.out.println(d2.before(d));
		LocalDate obj= LocalDate.now();
		System.out.println(obj);
		LocalTime obj2= LocalTime.now();
		System.out.println(obj2);
		System.out.println(d.getMonth());
		System.out.println(d.getHours());
		System.out.println(obj.getDayOfYear());
		System.out.println(obj.format(null));
		
		

		
		
		
		
	}

}
