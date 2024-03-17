package collextions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
public class hashSet_Example extends arrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set obj = new HashSet();
		obj.add(12);
		obj.add(12);
		System.out.println(obj);
		Set<Integer> obj1=new HashSet();
		obj1.add(1);
		obj1.add(12);
		System.out.println(obj1);
		Integer[] arr1= {1,2,3,4};
		Integer[] arr2= {5,4,3};
		Set<Integer[]> obj3=new HashSet();
		obj3.add(arr1);		
		obj3.add(arr2);
         for(Integer[] a : obj3) {
//        	 System.out.println(a);
        	 for(Integer b : a) {
        		 System.out.println(b);
        	 }
        	 
         }
         System.out.println(obj3);
         List listNum = new ArrayList();
         listNum.add(12);
         listNum.add(10);
         listNum.add(3);
         HashSet obj4=new HashSet(listNum);
		System.out.println(obj4);
		//////////////////////////////////Tree Set//////////////////////////////////////////////////////
		System.out.println("Tree Set::::::::::::::::::::::::::");
		Set treeobj1=new TreeSet();
		treeobj1.add(19);
		treeobj1.add(30);
		treeobj1.add(2);
		System.out.println(treeobj1);
		Iterator ite = treeobj1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		Stack staobj = new Stack();
		staobj.push(1);
		
	}
}
