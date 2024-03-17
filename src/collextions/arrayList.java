package collextions;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	

	public static void main(String[] args) {
		ArrayList arrayLis = new ArrayList();
		arrayLis.add("neela");
		arrayLis.add("bhavith");
		arrayLis.add("8106047602");
		arrayLis.remove(2);
		for(int i=0;i<arrayLis.size();i++) {
			System.out.println(arrayLis.get(i));
		}
		
		List arrayList1 = new ArrayList();
		arrayList1.add("ashok");
		arrayList1.add("vinith");
		arrayList1.add("8106047602");
		for(int i=0;i<arrayList1.size();i++) {
			System.out.println(arrayList1.get(i));
		}
		

	}

}
