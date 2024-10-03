package anjana;

public class ConditionalStatements2 {
	public void test1() {
		   
		String favoratesareename = "Bulesaree";
		String shopsaree = "Bulesaree";
		if (shopsaree.equals(favoratesareename) )
		{
			System.out.println("My wife will select that saree");
		}
		else
		{
			System.out.println("My wife will not select that saree");
		}
		
		
	}
	
	public void test2()
	{
		int [] collections = new int [] {2,8,7,9,3,4,6,5,10,1}; //positions 0,1,2,3,4,5,6,7,8,9
		int favsareenum = 9;
		for(int saree = 0; saree<10; saree++)// 0th =2
		{
			if(collections[saree] == favsareenum) //collection[0] = 2 // collection[1]=8// collection[2]=7// collection[3]=9
			{
				System.out.println("My wife will select that saree");
			}
			
		}
		
	}
	
	public void test3() {
		
		int [] sarrees = new int [] {2,8,7,9,3,4,6,5,10,1,45,33,29}; 
		
		int len = sarrees.length;  //10
		
		//for (int saree =0; saree<13; saree++)
		
		for (int s =0; s<len ; s ++) {
			System.out.println(sarrees[s]);
			
		}
	}
	public void test4() {
		int  number  = 12;//11//10.......//0
		
		
		while(number>0) {//12>0 if it is true then it  will go inside and print
			System.out.println("I like Java");
			number--;
		}
	
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionalStatements2 c = new ConditionalStatements2();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
	}

}
