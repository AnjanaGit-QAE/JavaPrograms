package assignments;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr=new int[] {12,14,15,17,27,20,12,22,26,07};
         int len=arr.length;
         for(int i=0;i<len;i++) {
        	 for(int j=i+1;j<len;j++) {
        		 if(arr[i] ==arr[j]) {
        			  System.out.println("Duplicate Element in an array is : "+ arr[i]);
        			  break ; 
        		 }
        	 }
         }
	}

}
