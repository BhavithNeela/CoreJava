package collextions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapExamples  {
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Map<Integer,String> obj = new HashMap<Integer,String>();
		obj.put(1,"Bhavith");
		obj.put(null,"1");
		obj.put(2,"Vinth");
		obj.put(3,"Ashok");
		System.out.println(obj.get(null));
		Student obj3= new Student();
		obj3.setKey(1,"bhvith");
		//obj3.setVar2(2, "Bhavith");
		Student obj4= new Student();
		//obj4.setVar1(1, "Vinith");
		obj4.setKey(2,"Vinth");
		//obj4.setVar2(2, "vinth");
		//List<Student> obj2 = new ArrayList<Student>();
		Map<Integer,Student> obj2 = new HashMap<Integer,Student>();
        obj2.put(1, obj3);
        obj2.put(2, obj4);
        for(Map.Entry<Integer, Student> stu : obj2.entrySet()) {
        	System.out.println(stu.getValue());
        }
        //obj2.add(obj3);
        //obj2.add(obj4);
		//System.out.println(obj2);
		ArrayList<Integer> aobj1 = new ArrayList<Integer>();
		aobj1.add(1);
		aobj1.add(2);
		ArrayList<Integer> aobj2 = new ArrayList<Integer>();
        aobj2.add(3);
        aobj2.add(4);
		Map<Integer,ArrayList<Integer>> aobj= new HashMap<Integer,ArrayList<Integer>>();  
		aobj.put(1, aobj1);
		aobj.put(2, aobj2);
		//System.out.println(aobj);
		for(Map.Entry<Integer, ArrayList<Integer>> ent : aobj.entrySet()) {
			System.out.println(ent.getValue());
			for(Integer a : ent.getValue()) {
		}
		}
		Map<Integer,Student> treeobj2 = new TreeMap<Integer,Student>();
		treeobj2.put(1, obj3);
		treeobj2.put(2,obj4);
		System.out.println(treeobj2);
		Map<Integer,Student> linkedobj = new LinkedHashMap<Integer,Student>();
		linkedobj.put(1, obj3);
		linkedobj.put(2,obj4);
		System.out.println(linkedobj);

		
	}
	
}