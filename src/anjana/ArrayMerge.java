package anjana;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int[] mergeArray = new int[len1+len2];
		
		for(int i=0;i<len1;i++) {
			mergeArray[i] = arr1[i];
		}
		
		for(int i=0;i<len2;i++) {
			mergeArray[len1+i] = arr2[i];
		}
		
		System.out.print("Merged Array is : " );
		
		for( int i : mergeArray ) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		// Using nrml loop
		int len = mergeArray.length;
		System.out.print("Elements in ana Array is : ");
		for(int i=0;i<len;i++) {
			System.out.print(mergeArray[i]+" ");
		}
		
		
	}

}
