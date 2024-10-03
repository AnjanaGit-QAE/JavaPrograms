package anjana;

public class DuplicateElements {

	public void Array1() {
		int[] intArray = new int[] {15,14,17,12,27,22,12,20,7,26,15};
		int len=intArray.length;
		System.out.println("Elements in An Int Array : ");
		for(int i=0;i<len;i++) {
			System.out.print( intArray[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse of elements in an Int Array : ");
		for(int i=len-1;i>=0;i--) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		System.out.print("Duplicate Elements in Integer Array : ");
		for(int firstnum=0;firstnum<len;firstnum++) {
			for(int secondnum=firstnum+1;secondnum<len;secondnum++ ) {
				if(intArray[firstnum] == intArray[secondnum]) {
					System.out.print(intArray[firstnum]+" ");
				}
			}
		}
	}
	
	public void Array2() {
		System.out.println();
		float [] floatArray = new float[] {15.98f,12.00f,15.98f,20.66f,12.5f,27,55f,02.34f,18f,12.00f,02.34f};
		int len1=floatArray.length;
		System.out.println();
		System.out.println("Elements in An Float Array");
		for (int i=0;i<len1;i++) { 
			 System.out.print(floatArray[i]+" "); 
		}
		System.out.println();
		System.out.println("Reverse of elements in an Float Array");
		 for(int i=len1-1;i>=0;i--) { 
			 System.out.print(floatArray[i]+" ");
		}
		 
		System.out.println();
		System.out.print("Duplicate Elements in Float Array : ");
		for(int fnum=0;fnum<len1;fnum++) {
			for(int snum=fnum+1;snum<len1;snum++) {
				if(floatArray[fnum]== floatArray[snum]) {
					System.out.print(floatArray[fnum]+" ");
				}
			}
		}
	}
	
	public void Array3() {
		System.out.println();
		char[] charArray=new char[] {'R','A','J','A','B','S','R'};
		int len2 =charArray.length;
		System.out.println();
		System.out.println("Elements in An Char Array");
		  for (int i=0;i<len2;i++) { 
			  System.out.print(charArray[i]+" "); 
		   }
		  System.out.println();
		  System.out.println("Reverse of elements in  An Char Array");
		   for(int i=len2-1;i>=0;i--) {
			   System.out.print(charArray[i]+" ");
			}
		   System.out.println();
		System.out.print("Duplicate Elements in Charecter Array : ");
		for(int fletter=0;fletter<len2;fletter++) {
			for(int sletter=fletter+1;sletter<len2;sletter++) {
				if(charArray[fletter]==charArray[sletter]) {
					System.out.print(charArray[fletter]+" ");
				}
			}
		}
	}
	
	public void Array4() {
		System.out.println();
		String[] strArray= new String[] {"Anjana","Raja","Sharanya","Dad","lavanya","Siddu","Raja","Dad","Anjana"};
		int len3=strArray.length;
		System.out.println();
		System.out.println("Elements in An String Array");
		 for (int i=0;i<len3;i++) {
			 System.out.print(strArray[i]+" ");
			}
		 System.out.println();
		 System.out.println("Reverse of Elements in an String Array");
		  for(int i=len3-1;i>=0;i--) { 
			  System.out.print(strArray[i]+" ");
			}
		  System.out.println();
		System.out.print("Duplicate Elements in String Array using.equals() method: ");
		for(int fword=0;fword<len3;fword++) {
				for(int sword=fword+1;sword<len3;sword++) {
					if(strArray[fword].equals(strArray[sword])) {
						System.out.print(strArray[fword]+" ");
					}
				}
		    }
	  }
	
	public void Array5() {
		System.out.println();
		String[] strArray= new String[] {"Anjana","Raja","Sharanya","Dad","Mom","lavanya","Siddu","raja","mom","dad","anjana"};
		int len3=strArray.length;
		System.out.println();
		System.out.println("Elements in An String Array");
		 for (int i=0;i<len3;i++) {
			 System.out.print(strArray[i]+" "); 
			}
		 System.out.println();
		 System.out.print("Reverse of elements in An String Array");
		 System.out.println();
		   for(int i=len3-1;i>=0;i--) { 
			   System.out.print(strArray[i]+" "); 
			}
		 
		System.out.println();
		System.out.print("Duplicate Elements in String Array using .equalsIgnoreCase() method : ");
		for(int fword=0;fword<len3;fword++) {
				for(int sword=fword+1;sword<len3;sword++) {
					if(strArray[fword].equalsIgnoreCase(strArray[sword])) {
						System.out.print(strArray[fword]+" ");
					}
				}
		    }
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElements d = new DuplicateElements();
		d.Array1();
		d.Array2();
		d.Array3();
		d.Array4();
		d.Array5();
	}

}
