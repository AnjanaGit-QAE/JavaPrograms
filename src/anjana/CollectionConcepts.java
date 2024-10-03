package anjana;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[2]; //fixed size not able to perform many elements to add in array
		arr[0]=12;
		arr[1]=22;
		System.out.println(arr[0]);
		
		ArrayList<Integer> arrL=new ArrayList<Integer>(); // Dynamic Size , We can add Many elements and manupulate ArrayList
		arrL.add(12);
		arrL.add(22);
		arrL.remove(0);
		arrL.add(1, 20);
		System.out.println(arrL.get(1));
		System.out.println("Elements in an ArrayList is : " + arrL);
		
		ArrayList<String> arrL1=new ArrayList<String>();  // Dynamic Size 
		arrL1.add("Anjana");
		arrL1.add("Raja");
		arrL1.add(1, "Sharanya");
		arrL1.add(3, "Hey !!");
		arrL1.remove(2);
		System.out.println("Elements in an ArrayList is : " + arrL1);
		
		LinkedList<String> Llist1=new LinkedList<String>();  // Dynamic Size 
		Llist1.add("Anjana");
		Llist1.add("Raja");
		Llist1.add(1, "Sharanya");
		Llist1.add(2, "Hey !!  How Are You");
		Llist1.remove(3);
		System.out.println("Elements in an LinkedList is : " + Llist1);
		
		
		List<String> l1=new ArrayList<String> (); 
		
		//List is an interface implementing ArrayList class.
		//As interface(List) we can't create object to an interface.
		
		l1.add("Hey !!");
		l1.add(1, "Anjana");
		l1.add("Sharanya");
		l1.remove(2);
		System.out.println("Elements in an List Interface is : " + l1);
		
		//Normal For Loop
		int[] arr1=new int[] {12,14,15,17,27,22,20};
		int len=arr1.length;
		System.out.print("Elements in Array is : ");
		for(int i=0;i<len;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		//Advanced for loop
		int[] arr2=new int[] {02,07,12,22,15,14,27,22,26};
		System.out.println();
		System.out.print("Elements in Advanced Array is : ");
		for(int i : arr2) {
			System.out.print(i +" "); // for an Advanced for loop simply we can print elements with alone iterator variable. No need of  Array Name(arr2).
		}
		
		  // List is a Ordered Collection of Data.
		  // Allows  'N' no of  Null values.
		
		  List<String> list1 = new ArrayList<String> ();
		  //List<String> list1 = new ArrayList<> ();
		  
		  list1.add("kanchan");
		  list1.add("raja");
		  list1.add("anjana");
		  list1.add("aarti");
		  list1.add("vinod"); 
		  list1.add("aarti");
		  list1.add(null);
		  list1.add(null);
		  list1.add(null);
		  System.out.println();
		  for (String i : list1)
		  {
			  System.out.println(i);
		  }
		  
		  System.out.println("************************************************");
		  
		  //Unordered Collection of Data
		  // Allows only one Null value
		  
		  Set<String> s1 = new HashSet();
		  s1.add("kanchan");
		  s1.add("raja");
		  s1.add("anjana");
		  s1.add("aarti"); 
		  s1.add("vinod"); 
		  s1.add("aarti");
		  s1.add(null); 
		  s1.add(null);
		  
		  for (String i : s1) 
		  { 
			  System.out.println(i);
		  }

	}

}
