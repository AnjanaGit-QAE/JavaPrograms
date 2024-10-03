package anjana;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using Temp Variable
        int num1=12; 
        int num2=22;
        System.out.println("Before Swapping" );
        System.out.println(" First Number :" +num1);
        System.out.println(" Second Number :" +num2);
        
        int temp;  //declaring temporary variable
        
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println();System.out.println("After Swapping" );
        System.out.println(" First Number :" + num1);
        System.out.println(" Second Number :"+ num2);
        
        // Without using temporary variable
        int n1=10;
        int n2=20;
        System.out.println();
        System.out.println("Before Swapping" );
        System.out.println(" First Number :" +n1);
        System.out.println(" Second Number :" +n2);
        
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println();
        System.out.println("After Swapping" );
        System.out.println(" First Number :" + n1);
        System.out.println(" Second Number :"+ n2);
        
        
        
	}

}
