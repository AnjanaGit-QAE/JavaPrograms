package anjana;

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
		
		for (int i = 1; i<=6;i++) // 1 2 3 4 5 6
		{
			for (int j =i; j<=6; j++)
				//i = 1 & j = i ||so j=1 ,j = 2 , j= 3 , j=4, j=5, j=6 so it will print 6 starts
				//i = 2 & j = i ||so j=2 ,j=3, j=4 , j=5 , j= 6 so it will  print 5 starts
				//i = 3 & j = i ||so j=3 , j=4, j=5, j=6 so it will  print 4 starts
				//i = 4 & j = i ||so j=4 , j=5, j=6 so it will  print 3 starts
				//i = 5 & j = i ||so j=5, j=6 so it will  print 2 starts
				//i = 6 & j = i ||so j=6 so it will  print 1 start
			{
				System.out.print("*");
			}
			System.out.println(); // it will move to the next line
		}
		
		System.out.println("Another Method");
		System.out.println();
		
		int row=6;
		for(int i=row;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
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
		
		for (int i = 1; i<=6;i++) // 1 2 3 4 5 6
		{
			for (int j =1; j<=i; j++) {
              //i =1 and  j = 1 and the condition is j<=i 1<=1  both j and i is equal so it will one star  then it will increase the value so j will become 2
			  // j = 2 	j<=i 2<=1 so condition fails then this for loop will be exited
				
				
		     // i =2 and j = 1 and the condition is j<=i 1<=2 now j is lesser than two times of i so it will print 2 stars
						
		     // i =3 and j = 1 and the condition is j<=i 1<=3 now j is lesser than three times of i so it will print 3 stars
				
		    // i =4 and j = 1 and the condition is j<=i 1<=4 now j is lesser than four times of  i so it will print 4 stars	
				
		    // i =5 and j = 1 and the condition is j<=i 1<=5 now j is lesser than five times of i so it will print 5 stars
				
		   // i =6 and j = 1 and the condition is j<=i 1<=6 now j is lesser than 6 times times so it will print 6 stars
			
				System.out.print("*");
			}
			System.out.println(); // it will move to the next line
		}
		
		System.out.println();
		System.out.println("Triangle Pattern");
		
		// Pattern-3
		
		// * 
	    //* * 
	   //* * * 
	  //* * * * 
	 //* * * * *
		
		 int num = 5;
		 for (int i = 1; i <= num; i++) { // 1 2 3 4 5
			  
	            // loop to print the number of spaces before the star 
	            for (int j = num; j >= i; j--) { // j = 10 ; and the condition is 10>=1 so 10 time it will print spaces
	                System.out.print(" "); 
	            } 
	  
	            // loop to print the number of stars in each row 
	            for (int j = 1; j <= i; j++) { 
	                System.out.print("* "); 
	            } 
	  
	            // for new line after printing each row 
	            System.out.println(); 
	        }
		
		
	}

}
