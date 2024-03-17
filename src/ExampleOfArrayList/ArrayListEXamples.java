package ExampleOfArrayList;

import java.util.ArrayList;

public class ArrayListEXamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<Integer>();
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		//obj.add(3);
		obj.add(9);
		obj.add(1);
		obj.add(1);
		obj.add(1);
		obj.add(11);
		obj.add(3);
		obj.add(3);
		obj.add(10);
		obj.add(13);
		obj1.add(1);
		obj1.add(1);
		obj1.add(3);
		obj1.add(2);
		obj1.add(7);
		obj1.add(8);
		
		
		//findLargeNumber(obj);
		//rotate(obj,2);
		//missingNumber(obj1);
		dulipcate(obj);
		
		
	}
	static void dulipcate(ArrayList<Integer> obj) {
		//System.out.println(obj);
		for(int i=0;i<obj.size();i++) {
			for(int j=i+1;j<obj.size()-1;j++) {
				{
				  if( obj.get(i) == obj.get(j)) {//
					  obj.remove(j);
					  j--
					  ;
				  }
				 // System.out.println(obj.get(2));
				}
			}
		}
		System.out.println(obj);
		
	}
	static void findLargeNumber(ArrayList<Integer> obj1) {
	    int a,b,var;
		for(int i=0;i<obj1.size();i++) {
		for(int j=i+1;j<obj1.size()-1;j++) {
			{
			  if(obj1.get(i)>obj1.get(j)) {
				  a= obj1.get(i);
				  b= obj1.get(j);
                  var = a;
                  a = b;
                  b = a;
                  obj1.set(i, b);
                  obj1.set(j, var);
			  }
			}
			//System.out.println(obj.get(i));
	}
		
	}   
		System.out.println("Sorted Array"+obj1);
		System.out.println("Second Largest Numbet in List::"+obj1.get(obj1.size()-2));
		
	}
	static void rotate(ArrayList<Integer> obj ,  int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<obj.size();i++) {
			if(i<n) {
				obj.add(obj.get(i));
			}			
		}
		for(int i=n;i<obj.size();i++) {

		a.add(obj.get(i));
		
	}
System.out.println(a);
	}
	static  void missingNumber(ArrayList<Integer> obj) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=1;i<10;i++) {
			int count=0;
			for(int j=0;j<obj.size();j++) {
				
				if(i != obj.get(j)) {
					count++;
				
			}
				if(count==obj.size()) a.add(i);
		}	 
	}
		//System.out.println(obj);
		System.out.println(a);
}
}
