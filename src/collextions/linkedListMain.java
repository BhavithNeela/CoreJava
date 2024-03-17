package collextions;

import java.util.LinkedList;



public class linkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj = new LinkedList();
		obj.add(200);
		obj.add(0,199);
		obj.add(0,198);
		//System.out.println(obj.get(0));
		LinkedList<LinkedList> obj1 = new LinkedList();
		obj1.add(obj);
		System.out.println(obj1.get(0).get(0));
		

	}
	

}
