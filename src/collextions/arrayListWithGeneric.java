package collextions;

import java.util.ArrayList;

public class arrayListWithGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] iary = {1,2,3,4,5,6,7};
		Integer[] iary1 = {3,2};
		
		ArrayList<Integer[]> array1=new ArrayList<Integer[]>();
		array1.add(iary); 
		array1.add(iary1);
		System.out.println("elements in array");
		
        for(int i=0;i<array1.size();i++ ) {
        	for(int j=0;j<array1.get(i).length;j++) {
        		System.out.println(array1.get(i)[j]);
        	}
        	
        }
		
		//Add.add(499);
//		System.out.println()
//		

		ArrayList<Float> Add1=new ArrayList<Float>();
		Add1.add(12.4F);
		Add1.add(13.f);
		System.out.println(Add1);
		ArrayList<Boolean> Add2=new ArrayList<Boolean>();
		Add2.add(true);
		Add2.add(false);
		System.out.println(Add2);
		ArrayList<TestData> Add3=new ArrayList<TestData>();
		TestData obj=new TestData();
		obj.setVar1(1000);
		obj.setVar2(20);
		//obj.setVar1(10);
		Add3.add(obj);
		for(int i=0;i<Add3.size();i++) {
			System.out.println(Add3.get(i).var1);
		}
		System.out.println(Add3);
		ArrayList<ArrayList<TestData>> arrayList=new ArrayList<ArrayList<TestData>>();
		arrayList.add(Add3);
		for(int i=0;i<arrayList.size();i++) {
			for(int j=0;j<arrayList.get(i).size();j++) {
				
				System.out.println(arrayList.get(i).get(j).getVar1());
//				TestData testData =arrayList.get(i).get(j);
				
			}

		}
	System.out.println("arraylist in arraylist"+arrayList.get(0)
	);
		
		

	}

}
