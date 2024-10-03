package assignments;

public class ArraysPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer Array");
        int[] intarr= new int[] {12,14,15,17,27,22,20,07,26};
        int len=intarr.length;
        System.out.print("Elements in an Integer Array is: ");
        for(int i=0;i<len;i++) {
        	System.out.print(intarr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse of Elements in an Integer Array is: ");
        for(int i=len-1;i>=0;i--) {
        	System.out.print(intarr[i]+" ");
        }
        
        System.out.println();
        System.out.println("Charecter Array");
        char[] chararr= new char[] { 'a','s','r','w','m','c','k','d','k'};
        int len1=intarr.length;
        System.out.print("Elements in an Charecter Array is: ");
        for(int i=0;i<len1;i++) {
        	System.out.print(chararr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse of Elements in an Charecter Array is: ");
        for(int i=len1-1;i>=0;i--) {
        	System.out.print(chararr[i]+" ");
        }
        
        
        System.out.println();
        System.out.println("Float Array");
        float[] floatrarr= new float[] {12.34f,14.76f,15.78f,17.99f,27.00f,22.45f,20.32f,07.34f,26.00f};
        int len2=intarr.length;
        System.out.print("Elements in an Float Array is: ");
        for(int i=0;i<len2;i++) {
        	System.out.print(floatrarr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse of Elements in an Float Array is: ");
        for(int i=len2-1;i>=0;i--) {
        	System.out.print(floatrarr[i]+" ");
        }
        
        System.out.println();
        System.out.println("String Array");
        String[] strarr= new String[] {"Anjana","Sharanya","Raja"};
        int len3=strarr.length;
        System.out.print("Elements in an String Array is: ");
        for(int i=0;i<len3;i++) {
        	System.out.print(strarr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse of Elements in an String Array is: ");
        for(int i=len3-1;i>=0;i--) {
        	System.out.print(strarr[i]+" ");
        }
	}

}
