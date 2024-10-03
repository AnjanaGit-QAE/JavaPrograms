package anjana;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int[] a= {10,20,30,40};
		int[] b= {20,30,40,50};
		
		int[] result = new int[4];
		result[0] = a[0] + b[3];
		result[1] = a[1] + b[2]; 
        result[2] = a[2] + b[1];
        result[3] = a[3] + b[0];
        
        int len = result.length;
       
        for(int i=0;i<len;i++) {
        	System.out.print( result[i]+" ");
        }
        
        System.out.println();
        for(int value : result) {
        	System.out.print(value+ " ");
        }
	}

}
