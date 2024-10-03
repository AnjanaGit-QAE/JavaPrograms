package anjana;

public class PatternNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5 5 5 5 5 
		// 4 4 4 4 
		// 3 3 3 
		// 2 2
		// 1
		
		int num=5;
		while(num >= 0) {
			
			for(int i=1;i<=num;i++) { //  1 2 3 4 5
				System.out.print(num+ " ");
			}
			System.out.println();
			num=num-1;
		}
		
		System.out.println("Another Method");
		 
		  int roows = 5;
		 
		  for(int i=roows;i>=1;i--) {
			 
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(i +" ");
				 
			 }
			 System.out.println();
		 }
		 
		
		System.out.println("**********************");
		
		// 1 2 3 4 5 
		// 1 2 3 4 
		// 1 2 3 
		// 1 2 
		// 1
		
		 int n = 5;
		 while (n >= 0) {
		        	
		    for (int i=1; i<=n; i++) {
		          System.out.print(i + " ");
		    }
		            
		    System.out.println();
		    n--; 
	    }
		 
		 
          System.out.println("Another Method");
		 
		  int rws = 5;
		 
		  for(int i=rws;i>=1;i--) {
			 
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(j +" ");
				 
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("**********************");
		 
		// 1 
		// 2 2
		// 3 3 3 
		// 4 4 4 4 
		// 5 5 5 5 5
		 
		 int n1=1;
		 int rows=1;
		 
		 while(rows<=5) {
			 
			 for(int i=1;i<=rows;i++) {
				 System.out.print(n1+" ");
			 }
			 System.out.println();
			 rows++;
			 n1++;
		 }
		 
		 System.out.println("Another Method");
		 
		 int rwss = 5;
		 
		 for(int i=1;i<=rwss;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(i +" ");
				 
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
		 System.out.println();
		 System.out.println("**********************");
		 
		 
		 // 1 
		 // 1 2 
		 // 1 2 3 
		 // 1 2 3 4 
		 // 1 2 3 4 5 
		 
		 int num1=1;
		 int row=1;
		 
		 while(row<=5) {
			 
			 for(int i=1;i<=row;i++) {
				 System.out.print(i +" ");
			 }
			 System.out.println();
			 row++;
			 n1++;
			 
		 }
		 
		 System.out.println("Another Method");
		 int number = 1;
		 int rw = 5;
		 
		 for(int i=1;i<=rw;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(j +" ");
				 
			 }
			 System.out.println();
		 }
		 
		 // 1 
		 // 2 3 
		 // 4 5 6 
		 // 7 8 9 10 
		
		 System.out.println("**********************");
		
		 int numm1 = 1;
		 
		 for(int i=1;i<=4;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(numm1+" ");
				 numm1++;
			 }
			 System.out.println();
		 }
		 
		 // 1 
		 // 1 3 
		 // 1 3 5 
		 // 1 3 5 7 
		 // 1 3 5 7 9 
		 
		 System.out.println("***************");
		 int rwsss = 5;
		 
		 for(int i=1;i<=rwss;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(2*j-1+" ");
			 }
			 System.out.println();
		 }
		 
		 
		 // 2 
		 // 2 4 
		 // 2 4 6 
		 // 2 4 6 8 
		 // 2 4 6 8 10
		 
		 System.out.println("*****************");
		 int rowws=5;
		 
		 for(int i=1;i<=rowws;i++) {
			 
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(2*j+ " ");
			 }
			 System.out.println();
		 }
		 
	}

}
