package anjana;

public class ArrayComparisonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int[] arr1= {15,14,17,20,12,22,27,07,26,02};
       int[] arr2= {22,01,07,16,12,65,78,99,14,02};
       
       int len1=arr1.length;
       int len2=arr2.length;
       int count=0;
       
       System.out.print("Matching Elements in an Array is :");
       
       for(int i=0;i<len1;i++) {
    	   for(int j=0;j<len2;j++) {
    		   
    		   if(arr1[i] == arr2[j]) {
    			   System.out.print(arr1[i]+" ");
    			   count++;
    			   //break;
    		   }
    	   }
       }
       
       System.out.println();
       System.out.println("No of matching Elements in an Array is : "+count);
	}

}
