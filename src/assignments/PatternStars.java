package assignments;

public class PatternStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Pattern-1
		
		//******
		//*****
		//****
		//***
		//**
		//*
		
		for(int i=1;i<=6;i++) {
			for(int j=i;j<=6;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Next Pattern");
		
		
		// Pattern-2
		
		//*
		//**
		//***
		//****
		//*****
		//******
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Triangle Pattern");
		
		// Pattern-3
		
		// * 
	    //* * 
	   //* * * 
	  //* * * * 
	 //* * * * *
		
		int num=5;
		for(int i=1;i<=num;i++) {
			
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			
			for( int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
