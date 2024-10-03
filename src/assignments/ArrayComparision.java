package assignments;

public class ArrayComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int[] arr1 = new int[] {12,13,14,23,24,34,66,56,99,27,22,20};
       int[] arr2 = new int[] {36,99,88,77,66,12,20,22,27,14,24,56};
       int len1=arr1.length;
       int len2=arr2.length;
       int count=0;
       System.out.print("Matching Elements in an Array is :");
       for(int i=0;i<len1;i++) {
    	   for(int j=0;j<len2;j++) {
    		   if(arr1[i] == arr2[j]) {
    			   System.out.print( arr1[i]+" ");
    			   count++;
    		   }
    	   }
       }
       System.out.println();
       System.out.println("No=of Elements in an Array is : "+ count);
       
	}

}
