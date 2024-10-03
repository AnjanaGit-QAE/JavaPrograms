package anjana;

public class ArrayPrograms {

	public static void main(String[] args) {
		
         int[] arr= {112,2,3,6,209,169,9,12,34,99};
         int sum=0;
         int len=arr.length;
        
         for( int i=0;i<len;i++) {
        	 sum=sum+arr[i];
         }
         System.out.println("Sum of Elements in an Array :" + " "+ sum);
         
         int max=arr[0];
         for(int j=1;j<len;j++) {
        	 if(arr[j]> max) {
        		max=arr[j];
        	 }
         }
         System.out.println("Maximum Element in Array is :"+" "+ max);
         
         System.out.println("Reverse of an Array : ");
         for(int k=len-1;k>=0;k--) {
        	 System.out.print(arr[k]+" ");
         }
         
         System.out.println();
         for(int a=0;a<len;a++) {
        	 sum=sum+arr[a];
         }
         int avg=sum/len;
         System.out.println("Average of a given Array elements is "+ avg);

         int find=209;
         for(int b=0;b<len;b++) {
        	 if(arr[b]== find) {
        		 System.out.println("Element Found :"+" "+ arr[b]);
        	 }
         }
	}
}
