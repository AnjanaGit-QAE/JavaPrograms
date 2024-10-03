package assignments;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Swapping of Numbers using Temporary Variable");
        int n1=12,n2=22,temp;
        System.out.println("Before Swapping : ");
        System.out.println(n1);
        System.out.println(n2);
        temp=n1;
        n1=n2; 
        n2=temp;
        System.out.println("After Swapping : ");
        System.out.println(n1);
        System.out.println(n2);
        
        System.out.println();
        System.out.println("Swapping of Numbers without using Temporary Variable");
        int num1=20,num2=40;
        System.out.println("Before Swapping : ");
        System.out.println(num1);
        System.out.println(num2);
        
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping : ");
        System.out.println(num1);
        System.out.println(num2);
        
       
        
	}

}
